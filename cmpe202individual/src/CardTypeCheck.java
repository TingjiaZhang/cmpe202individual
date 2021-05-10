import java.util.Scanner;

import static java.lang.String.valueOf;

public class CardTypeCheck {

    public static void Check(String i) {
        System.out.println("Please input a card type:MC for MasterCard;" +
                "Visa for Visa;AmEx for AmericanExpress;Ms for Master card");
        Scanner input1 = new Scanner(System.in);
        i = input1.nextLine();//read int
        switch (i) {
            case "MC", "AmEx", "Ms", "Visa" -> System.out.println("Card Type confirm:" + i);
            default -> {
                System.out.println("No such card type.");
            }
        }
        if (i.equals("Visa")) {
            System.out.println("Please input your card number:");
            Scanner card_number = new Scanner(System.in);
            String index = card_number.next();
            long x = Long.parseLong(index);
            int m = 1;
            for (int j = 0; j < (int) Math.log10(x); j++) {
                m *= 10;
            }
            long digit = x / m;
            int digit2 = (int) (x / 1000000000000000L);
//            long number = x;
//            String temp = valueOf(number);
//            temp = temp.substring(0,1);//从第0（第一位）开始，截取长度为1的字符串
//            number = Integer.parseInt(temp);
//            System.out.println(number);

            //System.out.println(digit);

            long digit_length = valueOf(index).length();
            if (digit_length != 13 && digit_length != 16) {
                System.out.println("The digit for Visa is 13 or 16,the first digit must be 4. wrong form");
            } else if (digit2 != 4) {
                System.out.println("The digit for Visa is 13 or 16,the first digit must be 4. wrong form");
            } else {
                System.out.println("Success");
            }
            System.out.println("Card Number is: " + index);
        } else if (i.equals("MC")) {
            System.out.println("Please input your card number:");
            Scanner card_number = new Scanner(System.in);
            String index = card_number.next();
            long x = Long.parseLong(index);
            int digit2 = (int) (x / 1000000000000000L);

            //System.out.println(digit2);
            long digit_length = valueOf(index).length();
            if (digit_length != 16||digit_length != 13) {
                System.out.println("The digit for Visa is 13 or 16,the first digit must be 4. wrong form");
            } else if (digit2 != 4) {
                System.out.println("The digit for Visa is 13 or 16,the first digit must be 4. wrong form");
            } else {
                System.out.println("Successlly");
            }
            System.out.println("Card Number is: " + index);
        }
        else if (i.equals("AmEx")) {
            System.out.println("Please input your card number:");
            Scanner card_number = new Scanner(System.in);
            String index = card_number.next();
            long x = Long.parseLong(index);
            int digit1 = (int) (x / 10000000000000L);
            int digit2 = (int) (x / 100000000000000L);
            System.out.println(digit2);
            long digit_length = valueOf(index).length();
            if (digit_length != 15) {
                System.out.println("first number is 3, second is from 4 || 7, length is 15.");
            } else if (digit2 != 3) {
                System.out.println("first number is 3, second is from 4 || 7, length is 15.");
            }
            else if (digit1 != 4||digit1 != 7) {
                System.out.println("first number is 3, second is from 4 || 7, length is 15.");
            }
            else {
                System.out.println("Successlly");
            }
            System.out.println("Card Number is: " + index);
        }

        else if (i.equals("Ms")) {
            System.out.println("Please input your card number:");
            Scanner card_number = new Scanner(System.in);
            String index = card_number.next();
            long x = Long.parseLong(index);
            int digit1 = (int) (x / 10000000000000L);
            int digit2 = (int) (x / 1000000000000000L);
            System.out.println(digit2);
            long digit_length = valueOf(index).length();
            if (digit_length != 15) {
                System.out.println("first number is 5, second is from 1 to 5, length is 16.");
            } else if (digit2 != 5) {
                System.out.println("first number is 5, second is from 1 to 5, length is 16.");
            }
            else if (digit1 != 1||digit1 != 5) {
                System.out.println("first number is 5, second is from 1 to 5, length is 16.");
            }
            else {
                System.out.println("Successlly");
            }
            System.out.println("Card Number is: " + index);


    }


}}
