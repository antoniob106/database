package Assignments;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AssignmentManager {
    public static void main(String[] args) {
        List<String> classList = new ArrayList<>(List.of("A", "B", "C")); // placeholder value
        File myFile = new File("Assignments/Assignments.txt");
        for (int i = 0; i < classList.size(); i++) {
            List<Assignment> assignmentList = new ArrayList<>();
            int currentID = 0;

            try {
                Scanner scanner = new Scanner(myFile);
                while (scanner.hasNextLine()) {
                    currentID++;
                    String[] line = scanner.nextLine().split("\\|");
                    assignmentList.add(new Assignment(line[0], line[1], currentID, i));
            }
            scanner.close();
            System.out.println("Loaded " + assignmentList.size() + " assignments.");
            assignmentList.forEach(System.out::println);
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found.");
            }
        }
    }
}

class Assignment {
    String name;
    String type;
    int ID;
    int classID;

    public Assignment(String name, String type, int ID, int classID) {
        this.name = name;
        this.type = type;
        this.ID = ID;
        this.classID = classID;
    }
        @Override
    public String toString() {
        return String.format("%s [%s][%d] [%03d]", name, type, ID, classID);
    }
}