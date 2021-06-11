

import java.util.Scanner;
public class Input_array {

        public void user_defined_array() {
            Scanner temp = new Scanner(System.in);
            System.out.println("enter the size to be declared to the array :");
            int[] arra = new int[temp.nextInt()];
            System.out.println(" enter how many elements you want to store in the array : ");
            int user = temp.nextInt();
            for (int i = 0; i < user; i++) {
                System.out.println("enter element number " + (i + 1));
                arra[i] = temp.nextInt();

            }
            for (int j : arra) {
                if (j != 0) {
                    System.out.println("elemenys present in array " + j);
                }
            }
        }
        public static void main(String [] args){
            Input_array temp =new Input_array();
            temp.user_defined_array();
        }
    }
