public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println("The Array values:");
        int sum=0;
        for(int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }

        System.out.println("The sum is "+ sum);
    }
}
