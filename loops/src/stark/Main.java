package stark;

public class Main {

    static int arr[]={10,20,30};
    public static void main(String[] args) {
	// sum of 10 numbers
        int sum=0;

        for(int i=0;i<=10;i++){
            sum=sum+i;
        }
                System.out.println("sum of 10 numbers is:"+sum);
        //enhanced for loop i.e foreach loop

        for(int x:arr){
            System.out.println("incase of for each"+3*x);
        }
        // using for loop instead of for each
        for(int i=0;i< arr.length;i++){
            System.out.println("incase of for loop"+ 2*arr[i]);
        }
    }
}
