
interface GPS{
    void navigate(String location);
}

class SmartCar implements Vehicle, GPS{
    String brand;
    SmartCar(String brand){
        this.brand =brand;
    }
    public void start(){
        System.out.println(brand+ " Car starts");
    }
    public void stop(){
        System.out.println(brand + " Car stops");
    }
    public void navigate(String location){
        System.out.println(brand + " smart car navigating to "+ location);
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        SmartCar tesla = new SmartCar("Tesla");
        tesla.start();
        tesla.navigate("New york");
        tesla.stop();
    }
}
