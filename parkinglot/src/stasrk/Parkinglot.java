package stasrk;

public class Parkinglot {
    private int[] slot;
    public  Parkinglot(int big,int medium,int small){
        slot=new int[]{big,medium,small};
    }
    public boolean addcar(int cartype){
        if(slot[cartype-1]>0){
            slot[cartype-1]--;
            return true;
        }
return false;
}

public static void main(String[]args){
        Parkinglot Parkinglot=new Parkinglot(1,1,0);
        System.out.println("add car on big slot"+Parkinglot.addcar(1));
    System.out.println("add car on medium slot"+Parkinglot.addcar(2));
    System.out.println("add car type  small"+Parkinglot.addcar(3));
   }
     }