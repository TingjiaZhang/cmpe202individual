import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {
        //read CSV
        Scanner sc = new Scanner(new File("../cmpe202individual/resource/csv.txt"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
        }
        sc.close();

        //Card Confirm
        CardTypeCheck.Check(null);

        //new user
        System.out.println("-----------------------");
        VisaCC p1 = new VisaCC();

        System.out.println("Please input the card date:");
        Scanner date = new Scanner(System.in);
        String hd = date.nextLine();
        p1.setDate(hd);

        System.out.println("Please input the card number:");
        Scanner num = new Scanner(System.in);
        String hm = date.nextLine();
        p1.setDigit(hm);

        System.out.println("Please input the card holder name:");
        Scanner nm = new Scanner(System.in);
        String he = date.nextLine();
        p1.setHolder_name(he);

        System.out.println("date："+p1.date+"Card Number:"+p1.digit+"Holder:"+p1.holder_name);

    }
}



