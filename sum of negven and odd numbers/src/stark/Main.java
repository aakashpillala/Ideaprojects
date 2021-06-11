package stark;

public class Main {

    public static void main(String[] args) {
        // sum of odd and even numbers in a given integer
        int even = 0;
        int odd = 0;


        int[] array = {1, 7, 3, 4, 5};
        for (int i=0; i<array.length; i++) {

            if(i%2 == 0.00) {
                even = even + array[i];
                System.out.println("even numbers are"+array[i]);
            } else {
                odd = odd + array[i];
                System.out.println("odd positions" +array[i]);
            }

        }
        System.out.println("sum of even numbers is " + even + " and sum of odd numbers is " + odd);
    }
}
