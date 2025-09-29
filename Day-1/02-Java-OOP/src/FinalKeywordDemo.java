//final class Calculator{
class Calculator{
    final double PI = 3.14;
    final void areaOfCircle(double radius){
//        PI = 3.15; // Not possible because PI is final variable
        double result = PI + radius * radius;
        System.out.println("Area of the circle: "+ result);
    }
}

//class AnotherCalculator extends Calculator{ // Not possible because Calculator is final class
//
//}

class  AnotherCalculator extends Calculator{
//    void areaOfCircle(double radius) { // Not possible because areaOfCircle is final method

//    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.areaOfCircle(5);
    }
}
