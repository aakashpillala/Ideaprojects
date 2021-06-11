package stark;

public class Main {
private static void doubleArray(int array[]) {
    for (int i = 0; i < array.length; i++) {
        System.out.println(2*array[i]);
    }
}  public static void main(String[] args) {
	// arrays called in methods
        int[] array=new int[3];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
        doubleArray( array);
    }
}
