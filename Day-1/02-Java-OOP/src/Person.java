// Defining a class
public class Person {
    // Attributes
    String name;
    int age;

    // default constructor
    Person(){

    }

    // Parameterized constructor
    Person(String n, int a){
        name = n;
        age = a;
    }

    // Methods
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }

    public static void main(String[] args) {
        // Creating an object for Person class
        Person john = new Person();

        // Access the attributes
        john.name = "John";
        john.age = 25;

        // access the methods
        john.display();

        // Creating object using parameterized constructor
        Person peter = new Person("Peter", 22);
        peter.display();
    }
}
