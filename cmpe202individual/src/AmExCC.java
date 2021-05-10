public class AmExCC extends CreditCard{
    private int digit;
    //first number is 3, second is from 4 || 7, length is 15.
    private String holder_name;
    private String date;

    public void setDate(String date) {
        this.date = date;
    }
    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }
    public void setDigit(int digit) {
        this.digit = digit;
    }

}
