package stark;

public class Main {

    public static void main(String[] args) {
        int var=0;
        while(true) {
            if (var > 4) {
                break;
            }
            if(var==0){
                var++;
                continue;
            }

            System.out.print("print var"+var+",");
            var++;
        }
    }
}
