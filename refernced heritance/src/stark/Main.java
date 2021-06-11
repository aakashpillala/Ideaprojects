package stark;

/**
 * the line Basereference basererference=new Derivedrefrerence();
 * creates a reference of parent class but points to an object of the subclass
 * now base reference can only call method of class derivedreference that have been inherited from class basereference
 * : only show method
 */
public class Main {

    public static void main(String[] args) {
	Basereference basereference=new Derivedreference();
	basereference.show();
	Basereference base=new Basereference();
	Derivedreference derived=new Derivedreference();
	base=derived;
	derived=base;// this gives an error of compilation
        //we cannot assign a reference of base class to derived class
    }
}
class Basereference{
    void show(){
        System.out.println("sahowq of a");
    }

}
class Derivedreference extends Basereference{
    void display(){
        System.out.println("displAY OF B");
    }
}
