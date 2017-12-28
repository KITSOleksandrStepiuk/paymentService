package com.kingfisher.payment.api.optile.service;

import com.kingfisher.payment.api.config.PropertiesConfig;
import com.kingfisher.payment.api.optile.model.NetworkList;
import com.kingfisher.payment.api.optile.model.Operation;
import com.kingfisher.payment.api.optile.model.Payout;
import com.kingfisher.payment.api.optile.model.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
//@RunWith(PowerMockRunner.class)
//@PowerMockRunnerDelegate(SpringRunner.class)
@SpringBootTest(classes = {OptileService.class, PropertiesConfig.class})
public class OptileServiceTest {

    private static final String CHARGE_ID = "chargeId";
    private static final String LIST_ID = "listId";

    @MockBean
    private RestTemplate customRestTemplate;

    @Autowired
    private OptileService optileService;

    @Test()
    public void postListRequestTest() {
        given(customRestTemplate.postForObject(any(String.class), any(HttpEntity.class), eq(NetworkList.class))).willReturn(new NetworkList());
        NetworkList list = optileService.postListRequest(new Transaction());
        verify(customRestTemplate, times(1)).postForObject(any(String.class), any(HttpEntity.class), eq(NetworkList.class));
    }

    @Test()
    public void closePaymentChargeTest() {
        given(customRestTemplate.postForObject(any(String.class), any(HttpEntity.class), eq(Payout.class))).willReturn(new Payout());
        Payout chargePayout = optileService.closePaymentCharge(CHARGE_ID, new Transaction());
        verify(customRestTemplate, times(1)).postForObject(any(String.class), any(HttpEntity.class), eq(Payout.class));
    }

    @Test()
    public void chargePaymentTest() {
        given(customRestTemplate.postForObject(any(String.class), any(HttpEntity.class), eq(Payout.class))).willReturn(new Payout());
        Payout chargePayout = optileService.chargePayment(LIST_ID, new Operation());
        verify(customRestTemplate, times(1)).postForObject(any(String.class), any(HttpEntity.class), eq(Payout.class));
    }

    @Test()
    public void refundPaymentTest() {
        given(customRestTemplate.postForObject(any(String.class), any(HttpEntity.class), eq(Payout.class))).willReturn(new Payout());
        Payout refundPayment = optileService.refundPayment(LIST_ID, new Operation());
        verify(customRestTemplate, times(1)).postForObject(any(String.class), any(HttpEntity.class), eq(Payout.class));
    }

}