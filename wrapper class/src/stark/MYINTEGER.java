package stark;
 class Man{
     private int i;
     //constructor
     Man(int j){

         i=j;
     }
     //public api
     public int intvalue(){

         return i;
     }

}
public class MYINTEGER{
     public static void main(String[]args){
         int x=10;
         //java defined wrapper classes
         Integer y=new Integer(x);
         System.out.println(y);
         //using the custom wrapper class create a wrapper class
         Man z=new Man(x);
         System.out.println(z.intvalue());
     }


}