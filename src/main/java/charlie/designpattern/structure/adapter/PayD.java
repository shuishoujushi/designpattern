package charlie.designpattern.structure.adapter;

/**
 * Created by charlie on 09/01/2018.
 */
public interface PayD {
    String getCustCardNo();
    String getCardOwnerName();
    String getCardExpMonthDate();
    Integer getCVVNo();
    Double getTotalAmount();

    void setCustCardNo(String custCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthDate(String cardExpMonthDate);
    void setCVVNo(Integer cvvNo);
    void setTotalAmount(Double totalAmount);
}
