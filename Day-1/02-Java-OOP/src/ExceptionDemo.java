import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    // Checked exception
    static void readFile(String filename) throws IOException{
        FileReader file = new FileReader(filename);
        BufferedReader reader = new BufferedReader(file);
        System.out.println(reader.readLine());
        reader.close();
    }
    // Unchecked exception
    static void divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("B value is zero");
        }
        int result = a / b;
        System.out.println("Result is "+ result);
    }

    public static void main(String[] args) {
        try {
            divide(100,0);
            readFile("example.txt");
        } catch (IOException e){
            System.out.println("Checked Exception: "+ e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Unchecked exception: "+ e.getMessage());
        } finally {
            System.out.println("Always execute code");
        }
    }
}
