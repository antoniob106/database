import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class departments {
    public static void main(String[] args) {

        File myObj = new File("departments.txt");

        try (Scanner myReader = new Scanner(myObj)) {
            int count = 0;
            while (myReader.hasNextLine()) {
                count++;
                System.out.println(myReader.nextLine() + ", ID: " + count); 
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }  
}