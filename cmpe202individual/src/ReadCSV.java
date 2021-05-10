import java.io.*;
import java.util.Scanner;

public class ReadCSV {


    public static void main(String[] args) throws Exception {
//parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("../cmpe202individual/resource/csv.txt"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();
    }

    //read a specific role or col
    public Object Specific(int row, int col) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("../cmpe202individual/resource/csv.txt"));
            String line = null;
            int index=0;
            while((line=reader.readLine())!=null){
                String item[] = line.split(" ");
                if(index==row-1){
                    if(item.length>=col-1){
                        String last = item[col-1];
                        System.out.println(last);
                    }
                }
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    }




