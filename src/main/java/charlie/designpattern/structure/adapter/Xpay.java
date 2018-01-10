package charlie.designpattern.structure.adapter;

/**
 * Created by charlie on 09/01/2018.
 */
public interface Xpay {
    String getCreditCardNo();
    String getCustomerName();
    String getCardExpMonth();
    String getCardExpYear();
    Short getCardCVVNo();
    Double getAmount();

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCardCVVNo(Short cardCVVNo);
    void setAmount(Double amount);
}
