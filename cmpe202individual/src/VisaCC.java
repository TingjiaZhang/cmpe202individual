public class VisaCC extends CreditCard{

    public static String digit;
    //first number is 4, length is 13 || 16.
    public String holder_name;
    public String date;

    public void setDate(String date) {
        this.date = date;
    }
    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }
    public void setDigit(String digit) {
        this.digit = digit;
    }
    public static void FirstNumberCheck(){

    }
}
