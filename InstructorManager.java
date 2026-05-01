import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    public static void main(String[] args) {
        File myFile = new File("Instructor.txt");
        List<Instructor> instructorList = new ArrayList<>();
        int currentID = 1; 

        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine(); 
                instructorList.add(new Instructor(name, currentID++));
            }
            scanner.close(); 
            System.out.println("Loaded " + instructorList.size() + " instructors.");
            instructorList.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

class Instructor {
    String name;
    int ID;

    public Instructor(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return String.format("%03d %s", ID, name);
    }
}