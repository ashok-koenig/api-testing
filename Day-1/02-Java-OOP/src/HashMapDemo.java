import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("John", 50);
        marks.put("Peter", 75);
        marks.put("Smith", 90);

        System.out.println("Student Marks: "+ marks);

        marks.put("John", 60);

        System.out.println("Student Marks: "+ marks);
        System.out.println("Smith mark: "+ marks.get("Smith"));
    }
}
