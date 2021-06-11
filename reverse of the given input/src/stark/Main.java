package stark;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp;
        int reversed=0;
        // reverse of given input
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value");
        int value = input.nextInt();
        while(value!= 0) {
            temp=value%10;
            reversed = reversed * 10 + temp;
            value = value/10;

        }System.out.println(reversed);
    }
}