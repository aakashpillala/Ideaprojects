package javaclass;

import java.util.Arrays;

public class Staticarray {
    public static void arraymanipulation(int[] array){
        for(int start=0;start<array.length;start++){
            System.out.println("with using only for loop"+array[start]);
        }
        for (int number: array) {
            System.out.println( "with using foreach "+array[number]);
        }
    }
    public static void main(String [] args) {
        int [] input = {1,2,3,4,5,6};
        arraymanipulation( input );
        /**
         *  Arrays.stream(input).forEach(System.out::println);
         */

    }
}
