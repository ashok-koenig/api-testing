public class OperatorsDemo {
    public static void main(String[] args) {
        int a=10, b=5;

        // Arithmetic Operators
        System.out.println("Arithmetic operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("Relational Operators");
        System.out.println(" a > b = " + (a>b));
        System.out.println(" a >= b = " + (a>=b));
        System.out.println(" a < b = " + (a<b));
        System.out.println(" a <= b = " + (a<b));
        System.out.println(" a == b = " + (a==b));
        System.out.println(" a != b = " + (a!=b));

        System.out.println("Ternary Operator");
        int max = (a>b)? a : b;
        System.out.println("Max = "+ max);

    }
}
