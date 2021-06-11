package stark;

public class Main {
     static int i=1;
    public static void main(String[] args) {
        // while loops

        while(i<=5){
            System.out.println("while loop is being executed");
            i++;
        }
        // do while execute after checks condition
        do{
            System.out.println(i);
            i++;
            if (i==5){
                break;
            }

        }while(i<=10);
    }
}
