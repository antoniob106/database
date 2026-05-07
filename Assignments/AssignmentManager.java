package Assignments;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class AssignmentManager {
    public static void main(String[] args) {
        File myFile = new File("Minors.txt");
        List<Minor> minorList = new ArrayList<>();
        int currentID = 1;
    }
    {
        File myFile = new File("Majors.txt");
        List<Major> majorList = new ArrayList<>();
        int currentID = 1;
    }

//         try {
//             Scanner scanner = new Scanner(myFile);
//             while (scanner.hasNextLine()) {
//                 String name = scanner.nextLine();
//                 assignmentList.add(new Assignment(name, currentID++));
//             }
//             scanner.close();
//             System.out.println("Loaded " + assignmentList.size() + " assignments.");
//             assignmentList.forEach(System.out::println);
//         } catch (FileNotFoundException e) {
//             System.out.println("Error: File not found.");
//         }
//     }
// }


// class Assignment {
//     String name;
//     int ID;


//     public Assignment(String name, int ID) {
//         this.name = name;
//         this.ID = ID;
//     }
//     @Override
//     public String toString() {
//         return String.format("[%03d] %s", ID, name);
//     }
// }