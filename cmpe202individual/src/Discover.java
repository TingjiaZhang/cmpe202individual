public class Discover extends CreditCard{
    private int digit;
    //first four number is 6011, length is 16.
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
