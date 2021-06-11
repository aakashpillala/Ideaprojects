package stark;

import java.util.concurrent.Callable;

class CopyConstructor{
    int age;
    String name;
    CopyConstructor(int age,String name){
        this.name=name;
        this.age=age;
    }
    CopyConstructor(CopyConstructor obj1){
        name= obj1.name;
        age= obj1.age;
    }
    void show(){
        System.out.println("name of the person is "+name+","+age);
    }
}
public class Main {

    public static void main(String[] args) {
	// copy constructor
        CopyConstructor obj1=new CopyConstructor(10,"aakash");
        //CopyConstructor obj2=obj1 is reference
        CopyConstructor obj2=new CopyConstructor(obj1);
        obj1.show();
      obj2.show();
            }
        };

