import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Instructor {
    public static void main(String[] args) {
        File myFile = new File("data.txt");
        List<String> dataList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(myFile);            
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                dataList.add(data); 
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}
