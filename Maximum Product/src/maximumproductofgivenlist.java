import java.util.*;
import java.lang.Integer;
public class maximumproductofgivenlist {
    public  int maximum(int [] list) {
        if (list.length <= 2) {
            return 0;
        }
        int MAX3 = Integer.MIN_VALUE;
        int Min1 = Integer.MAX_VALUE;
        int Min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int MAX2 = Integer.MIN_VALUE;
        for (int i=0;i< list.length;i++) {
            if (list[i] > max1) {
                MAX3 = MAX2;
                MAX2 = max1;
                max1 = i;
            }
            else if (list[i] > MAX2) {
                MAX3 = MAX2;
                MAX2 = i;
            }
            else if (list[i] > MAX3) {
                MAX3 = i;
            }
            if (list[i] < Min1) {
                Min2 = Min1;
                Min1 = i;
            }
            else if (list[i] < Min2) {
                Min2 = i;
            }
        }
        return (Math.max(max1*MAX2*MAX3,Min2*Min1*max1));
    }
    public static void main(String[]args){
        int [] array = {1,43,34,22,45};
        maximumproductofgivenlist obj = new maximumproductofgivenlist();
         int temp = obj.maximum(array);
        System.out.println(temp);
    }
}