package stark;

public class Main {

    public static void main(String[] args) {
	// wrapper class using constructor
        int gatescore=24;
        Integer my_gatescore=Integer.valueOf(gatescore);
        //new method is already integrated in value Of method
        System.out.println(gatescore);
        System.out.println(my_gatescore);
        Integer newwrapperclass=new Integer(45);
        System.out.println(newwrapperclass);
        /**
         * automatic conversion  of primitive data types into respective wrapper class is known as autoboxing
         * int   to to Integer wrapper class
         * since java5 we are not using valueOf() method for wrapper classes
         */
         Integer y=gatescore;
        System.out.println(y);
        /**
         *  we can convert wrapper class into primitive class back
         */

        int x=y.intValue();
        /**
         * automatic conversation of wrapper class into primitive data type
         * we dont have to use intValue from java5
         */
       int z=y;
        System.out.println(z);
        System.out.println(x);
    }
}
