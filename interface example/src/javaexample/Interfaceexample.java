package javaexample;
interface fuel{
    void fuel_info();
}
class Brio implements fuel
{
    public void fuel_info()
    {
        System.out.println("Brio runs on petrol");
    }
}
class Diesel implements fuel {
    public void fuel_info() {
        System.out.println("diesel runs on hydrogen fuel");
    }
}
class Tata_nexon implements fuel {
    public void fuel_info() {
        System.out.println("diesel runs on elecricity");
    }
}
public class Interfaceexample {
    public static void main(String[] args){
        fuel refarr[] = {
                new Brio(),
                new Diesel(),
                new Tata_nexon()

        };
        for(fuel ref:refarr){
            ref.fuel_info();
        }
    }
}
