import java.util.ArrayList;
import java.util.Scanner;

// this will p[rint squares of user entered numbers
public class variableSizedArrya {
    //ArrayList   class does not work with primitive data types
    public static void arraymanipulation(int n) {
        ArrayList<Integer> aaray = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            aaray.add(i * i);
        }
        //for (Integer i : aaray) {
          //  System.out.println(i);

        //}
        for(int start=0;start<=aaray.size();start++){
            System.out.println("square of "+start+"="+aaray.get(start));
       }
    }
    public static void main(String [] args){
        Scanner x= new Scanner(System.in) ;
        System.out.println("sqaures of first :");
        arraymanipulation(x.nextInt());
    }
}