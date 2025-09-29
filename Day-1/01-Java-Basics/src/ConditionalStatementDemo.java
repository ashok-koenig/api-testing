public class ConditionalStatementDemo {
    public static void main(String[] args) {
        int num = 100;

        // if-statement
        if(num >= 0){
            System.out.println("The number is positive");
        }
        // if-else statement
        if(num % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

        int day = 2;

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Unknown day number");
        }

    }
}
