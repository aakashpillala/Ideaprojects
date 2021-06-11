package stark;

public class Main {

    public static void main(String[] args) {
	// using continue statement
        for (int i=1;i<=10;++i){
            //if value of i is  between 4 &9
            //continue is  executed
            if(i>4 && i<9){
                continue;
            }
            System.out.println(i);
        }
    }
}
