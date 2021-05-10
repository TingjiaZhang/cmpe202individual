public class MasterCC extends CreditCard{

    private int digit;
    //first number is 5, second is from 1 to 5, length is 16.
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
