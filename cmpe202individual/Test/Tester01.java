import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import static java.lang.String.valueOf;

public class Tester01 {
    @Test
    //test how to check the digit
    public void test01() {
        System.out.println("this i s test01");
        CreditCard.getNum(29012, 4);
    }

    @Test
    public void tester02() {

        int index = 12346;
        int b = valueOf(index).length();
        System.out.println(b);

        int digit = 2135;
        int m = 1;
        for (int j = 0; j < (int) Math.log10(digit); j++) {
            m *= 10;
        }
        System.out.println(digit / m);

    }

    @Test
    public void tester03() {
        int a = 2019;
        int m = 1;
        for (int i = 0; i < (int) Math.log10(a); i++) {
            m *= 10;
        }
        System.out.println(a / m);
    }

    @Test
    public void tester04() {
        long number = 745654363563L;
        String temp = valueOf(number);
        temp = temp.substring(0, 1);//从第0（第一位）开始，截取长度为1的字符串
        number = Integer.parseInt(temp);
        System.out.println(number);
    }

    @Test
    public void tester05() {
        CreditCard te = new CreditCard();
        System.out.println(te.getKNumber(2, 152543563635633L));
    }

    @Test
    public void tester06() throws IOException {
        ReadCSV test = new ReadCSV();
//        for(int a=2; a <6; a++){
//            test.Specific(a, 1);
//        }
        test.Specific(2, 1);


    }
}



