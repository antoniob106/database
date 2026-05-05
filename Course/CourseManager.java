package Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager {
        public static void main(String[] args) {
        File myFile = new File("Course/Course.txt");
        List<Course> courseList = new ArrayList<>();
        int currentID = 0;

        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                currentID++;
                String[] line = scanner.nextLine().split("\\|");
                courseList.add(new Course(line[0], currentID, Integer.parseInt(line[1])));
            }
            scanner.close();
            System.out.println("Loaded " + courseList.size() + " courses.");
            courseList.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

class Course {
    String name;
    int ID;
    int CourseType;

    public Course(String name, int ID, int CourseType) {
        this.name = name;
        this.ID = ID;
        this.CourseType = CourseType;
    }
        @Override
    public String toString() {
        return String.format("[%03d] %s %d", ID, name, CourseType);
    }
}