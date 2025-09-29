public class StaticDemo {

    // static variable
    static int objectCount;

    // Static block
    static {
        objectCount = 0;
    }

    // Static method
    static void showObjectCount() {
        System.out.println("Total objects created: "+ objectCount);
    }

    // Instance variable
    String objectName;

    StaticDemo(String objectName){
        this.objectName = objectName;
        objectCount++;
        System.out.println("Object created: "+ objectName);
    }

    public static void main(String[] args) {
        StaticDemo.showObjectCount();
        StaticDemo obj1 = new StaticDemo("Object 1");
        StaticDemo.showObjectCount();
        StaticDemo obj2 = new StaticDemo("Object 2");
        StaticDemo.showObjectCount();
    }
}
