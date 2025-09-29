interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle{
    String brand;
    Car(String brand){
        this.brand = brand;
    }
   public void start(){
       System.out.println(brand+ " Car starts");
   }
   public void stop(){
       System.out.println(brand + " Car stops");
   }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("BMW");
        myCar.start();
        myCar.stop();
    }
}
