import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");

        System.out.println("Courses: "+ courses);
        System.out.println("First course: "+ courses.get(0));
        System.out.println("Second course: "+ courses.get(1));
    }
}
