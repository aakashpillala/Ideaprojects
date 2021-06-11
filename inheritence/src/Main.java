
public class Main {
    public static void main(String[]args){
      sewr manages=new sewr();
      manages.lesr();
      manages.resp();
      manages.showdep();
    }

}
class dep{
    void showdep(){
        System.out.println("show parents");

    }
}
class rese extends dep{
    void resp(){

        System.out.println("show resap");
    }
}
class sewr extends rese{
    void lesr(){

        System.out.println("show sewr");
    }
}