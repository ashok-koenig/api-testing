public class Student extends Person{
    int grade;
    Student(String name, int age, int grade){
        // super() to call the parent class constructor
        super(name, age);
        this.grade = grade;
    }

    // Method overriding - base class and sub class is having method with same name.
    void display(){
        // Call the base class display() method
        super.display();
        System.out.println("Grade: "+ grade);
    }

    public static void main(String[] args) {
        Student smith = new Student("Smith", 15, 8);
        smith.display();
    }
}
