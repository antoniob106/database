import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class StudentManager {
    public static void main(String[] args) {
        File myFile = new File("students.txt");
        List<Student> studentList = new ArrayList<>();
        int currentID = 1;


        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                studentList.add(new Student(name, currentID++));
            }
            scanner.close();
            System.out.println("Loaded " + studentList.size() + " students.");
            studentList.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}


class Student {
    String name;
    int ID;


    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return String.format("[%03d] %s", ID, name);
    }
}
