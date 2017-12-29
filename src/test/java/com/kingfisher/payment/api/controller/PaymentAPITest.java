package com.kingfisher.payment.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import com.kingfisher.payment.api.database.service.CustomerService;
import com.kingfisher.payment.api.database.service.TransactionLogService;
import com.kingfisher.payment.api.optile.model.NetworkList;
import com.kingfisher.payment.api.optile.model.Registration;
import com.kingfisher.payment.api.optile.model.Transaction;
import com.kingfisher.payment.api.optile.service.OptileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.StreamUtils;

import java.nio.charset.Charset;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
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
    @Captor
    ArgumentCaptor<Transaction> optileServiceTransactionCaptor;

    @Test
    public void createPaymentSessionForNewCustomerTest() throws Exception {

        given(customerService.getCustomerRegistrationInfo(PROFILE_ID)).willReturn(Optional.empty());

        String input = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestInput.json"), Charset.defaultCharset());
        String output = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestOutput.json"), Charset.defaultCharset());

        Transaction transaction = objectMapper.readValue(input, Transaction.class);
        NetworkList networkList = objectMapper.readValue(output, NetworkList.class);


        given(optileService.postListRequest(any(Transaction.class))).willReturn(networkList);


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

        String input = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestInput.json"), Charset.defaultCharset());
        String output = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/optileListRequestOutput.json"), Charset.defaultCharset());

        NetworkList networkList = objectMapper.readValue(output, NetworkList.class);

        given(customerService.getCustomerRegistrationInfo(anyString())).willReturn(Optional.of(customerRegistrationInfo));
        given(optileService.postListRequest(any(Transaction.class))).willReturn(networkList);

        mvc.perform(post(URL_BASE+"/session/create").contentType(MediaType.APPLICATION_JSON).content(input))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().json(output));

        verify(optileService).postListRequest(optileServiceTransactionCaptor.capture());
        Registration registration = optileServiceTransactionCaptor.getValue().getCustomer().getRegistration();

        assertEquals(registration.getId(), OPTILE_CUSTOMER_ID);
        assertEquals(registration.getPassword(), OPTILE_PASSWORD);

    }

    @Test
    public void missingMandatoryFieldsWhileCratePaymentSession() throws Exception {

        /**
         Transaction:
             type: object
             required:
             - transactionId - generatedBy payment API service
             - country
             - callback
             - customer
             - payment
         */

        given(customerService.getCustomerRegistrationInfo(PROFILE_ID)).willReturn(Optional.empty());

        String input = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/missingMandatoryFieldsInput.json"), Charset.defaultCharset());
        String output = StreamUtils.copyToString(this.getClass().getClassLoader().getResourceAsStream("expectedJson/missingMandatoryFieldsOutput.json"), Charset.defaultCharset());

        NetworkList networkList = objectMapper.readValue(output, NetworkList.class);

        given(optileService.postListRequest(any(Transaction.class))).willReturn(networkList);

        mvc.perform(post(URL_BASE+"/session/create").contentType(MediaType.APPLICATION_JSON).content(input))
                .andExpect(status().is(400))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().json(output));



    }
}