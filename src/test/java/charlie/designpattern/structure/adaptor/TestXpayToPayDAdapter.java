package charlie.designpattern.structure.adaptor;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by charlie on 09/01/2018.
 */
public class TestXpayToPayDAdapter {
    private Xpay xpay;
    private PayD payD;

    @Before
    public void setUp() {
        xpay = new XpayImpl();
        xpay.setCreditCardNo("4392123487902132");
        xpay.setCustomerName("Charlie Wang");
        xpay.setCardCVVNo((short) 110);
        xpay.setCardExpMonth("11");
        xpay.setCardExpYear("12");
        xpay.setAmount(10000.00);
        payD = new XpayToPayDAdapter(xpay);
    }

    @Test
    public void testPayD() {
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
