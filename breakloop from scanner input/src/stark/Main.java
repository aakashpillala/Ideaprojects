package stark;
import java.util.Scanner;
public class Main {
    public static int value;


    public static void main(String[] args) {
        // break implimented inside scanner
        int value, sum = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("enter the value" );
            value=input.nextInt();
            if (value < 10) {
                break;


            }
            sum = sum + value;


        }
        System.out.println("sum of given numerical values" + sum);

    }
}