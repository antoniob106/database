import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class DepartmentManager {
    public static void main(String[] args) {
        File myFile = new File("departments.txt");
        List<Department> departmentList = new ArrayList<>();
        int currentID = 1;


        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                departmentList.add(new Department(name, currentID++));
            }
            scanner.close();
            System.out.println("Loaded " + departmentList.size() + " departments.");
            departmentList.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}


class Department {
    String name;
    int ID;


    public Department(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return String.format("[%03d] %s", ID, name);
    }
}
