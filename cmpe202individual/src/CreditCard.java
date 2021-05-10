import java.util.Scanner;

import static java.lang.String.valueOf;

public class CreditCard {


    public static void SpecificDigit() {
        int a = 2019;
        int m = 1;
        for (int i = 0; i < (int) Math.log10(a); i++) {
            m *= 10;
        }
        System.out.println(a / m);
    }



    public static void getNum(int num, int index) {
        String s = valueOf(num);
        String result = valueOf(s.charAt(s.length() - index));
        System.out.println("数字：" + num + "的第" + index + "位数字是" + result);
    }

    public int getKNumber(long k,long num){

        if(Math.pow(10, k-1)>num){
            return -1;
        }else{
            return (int) ((num/(long)Math.pow(10, k-1))%10);
        }
    }
    public void test(){

    }
}
