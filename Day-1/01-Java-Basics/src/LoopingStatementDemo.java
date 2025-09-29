public class LoopingStatementDemo {
    public static void main(String[] args) {
        // for loop statement
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        // while loop
        int j =1, sum =0;
        while(j<=5){
            sum = sum +j;
            j++;
        }
        System.out.println("Sum is "+ sum);

        // do-while loop
        int k=5;
        do{
            System.out.println(k);
            k--;
        }while (k>0);
    }
}
