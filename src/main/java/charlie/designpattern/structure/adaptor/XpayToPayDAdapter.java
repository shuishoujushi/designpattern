package charlie.designpattern.structure.adaptor;

/**
 * Created by charlie on 09/01/2018.
 */
public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
        this.setProp();
    }

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo(Integer cvvNo) {
        this.cVVNo = cvvNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp() {
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardOwnerName(this.xpay.getCustomerName());
        setCardExpMonthDate(this.xpay.getCardExpMonth() + "/" + this.xpay.getCardExpYear());
        setCVVNo(this.xpay.getCardCVVNo().intValue());
        setTotalAmount(this.xpay.getAmount());
    }
}
