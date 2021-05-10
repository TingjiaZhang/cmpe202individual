
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVUtils {
    public static void main(String[] args) {
        try {
            PrintWriter pw= new PrintWriter(new File("../cmpe202individual/output/test02.csv"));
            StringBuilder sb=new StringBuilder();
            sb.append("Expired_Date");
            sb.append(",");
            sb.append("Card_Digit");
            sb.append(",");
            sb.append("Card_Holder_Name");
            sb.append("\r\n");

            System.out.println("Please input the card date:");
            Scanner date = new Scanner(System.in);
            String hd = date.nextLine();

            System.out.println("Please input the card number:");
            Scanner num = new Scanner(System.in);
            String hm = date.nextLine();

            System.out.println("Please input the card holder name:");
            Scanner nm = new Scanner(System.in);
            String he = date.nextLine();

            sb.append(hd);
            sb.append(",");
            sb.append(hm);
            sb.append(",");
            sb.append(he);
            sb.append("\r\n");

            sb.append("");
            sb.append("\r\n");
            pw.write(sb.toString());
            pw.close();
            System.out.println("finished");
        } catch (Exception e) {

        }
    }
}
