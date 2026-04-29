import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class StudentName {
    public static void main(String[] args) {

        File myObj = new File("students.txt");

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