package com.kingfisher.payment.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import com.kingfisher.payment.api.database.service.CustomerService;
import com.kingfisher.payment.api.database.service.TransactionLogService;
import com.kingfisher.payment.api.optile.model.NetworkList;
import com.kingfisher.payment.api.optile.model.Transaction;
import com.kingfisher.payment.api.optile.service.OptileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.StreamUtils;

import java.nio.charset.Charset;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PaymentAPI.class)
public class PaymentAPITest {

    private static final String URL_BASE = "/api/v1/payment";
    private static final String PROFILE_ID = "profileId";
    private static final String OPTILE_CUSTOMER_ID = "optileCustomerId";
    private static final String OPTILE_PASSWORD = "optilePassword";

    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private OptileService optileService;
    @MockBean
    private CustomerService customerService;
    @MockBean
    private TransactionLogService transactionLogService;

    @Test
    public void createPaymentSessionForNewCustomerTest() throws Exception {

        given(customerService.getCustomerRegistrationInfo(PROFILE_ID)).willReturn(Optional.empty());

        String input = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestInput.json"), Charset.defaultCharset());
        String output = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestOutput.json"), Charset.defaultCharset());

        Transaction transaction = objectMapper.readValue(input, Transaction.class);
        NetworkList networkList = objectMapper.readValue(output, NetworkList.class);


        given(optileService.postListRequest(transaction)).willReturn(networkList);


        mvc.perform(post(URL_BASE+"/session/create").contentType(MediaType.APPLICATION_JSON).content(input))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().json(output));


    }

    @Test
    public void createPaymentSessionForExistingCustomerTest() throws Exception {

        CustomerRegistrationInfo customerRegistrationInfo = new CustomerRegistrationInfo();
        customerRegistrationInfo.setProfileId(PROFILE_ID);
        customerRegistrationInfo.setOptileCustomerId(OPTILE_CUSTOMER_ID);
        customerRegistrationInfo.setOptileCustomerPassword(OPTILE_PASSWORD);

        given(customerService.getCustomerRegistrationInfo(PROFILE_ID)).willReturn(Optional.of(customerRegistrationInfo));

        String input = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestInput.json"), Charset.defaultCharset());
        String output = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestOutput.json"), Charset.defaultCharset());

        Transaction transaction = objectMapper.readValue(input, Transaction.class);
        NetworkList networkList = objectMapper.readValue(output, NetworkList.class);


        given(optileService.postListRequest(transaction)).willReturn(networkList);


        mvc.perform(post(URL_BASE+"/session/create").contentType(MediaType.APPLICATION_JSON).content(input))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().json(output));


    }

}