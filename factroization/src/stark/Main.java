package stark;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// factrial of a number
        int sum=0;

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number=input.nextInt();
         int temp=number;
        for(int i=1;i<number;i++){
            sum=temp*i;
            temp=temp*i;
        }
        System.out.println("factrial of the given number is "+sum);

    }
}
