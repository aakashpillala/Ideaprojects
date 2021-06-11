package stark;

//if you create a constructor then
// it is your  responsibility to create default also
// generally jvm creates a default until you create another constructor

class ConstructorOverloading{
    String name;
    int age;
    ConstructorOverloading(){
        System.out.println("default constructor");
    }
    ConstructorOverloading(String name,int age ){
        this.name=name;
        this.age=age;
        System.out.println("constructor with two parameters "+age+","+name);
    }
    ConstructorOverloading(String name){
        this.name=name;
        System.out.println("constructor with single parameter "+name);
    }
}
public class Main {

    public static void main(String[] args) {
	// constructor overloading
      ConstructorOverloading over=new ConstructorOverloading();
      over=new ConstructorOverloading("aakash",21);
      over=new ConstructorOverloading("tony");

            }
        }


