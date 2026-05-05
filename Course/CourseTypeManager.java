package Course;
public class CourseTypeManager {
    public static void main(String[] args) {
        String[] courseTypes = {"AP","Regents","Elective"};
        int ID = 0;
        for (String courseType : courseTypes) {
            ID++;
            CourseType newCourse = new CourseType(ID, courseType);
        }
    }
}

class CourseType {
    String name;
    int ID;

    public CourseType(int ID, String name) {
        name = this.name;
        ID = this.ID;
    }
    @Override
    public String toString() {
        return String.format("[%03d] %s", ID, name);
    }
}