import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Confirm {


    public static void main(String[] args) throws IOException {
        System.out.println("Please input your file path:");
        //      ../cmpe202individual/resource/csv.txt
        Scanner path = new Scanner(System.in);
        String filename = path.nextLine();


        Scanner sc = new Scanner(new File(filename));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
        System.out.println("------------------------");

        System.out.println("------------------------");
        ReadCSV test = new ReadCSV();
        int a;
        for (a = 2; a < 6; a++) {
            test.Specific(a, 1);
        }

        System.out.println("------------------------");
        Object index = test.Specific(2, 1);

        System.out.println("Please input the card number you are searching:");
        Scanner number = new Scanner(System.in);
        String hd = number.nextLine();

        if (hd.equals(index)){
            System.out.println("afafa");
        }


    }
}
