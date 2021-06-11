package com.stark;
// swaping is not done
public class Main {

    public static void main(String[] args) {
	// swaping two variables
        Double i= new Double();
        i.x=10;
        Double j=new Double();
        j.x=20;
        swap(i.x,j.x);
        System.out.println("i="+i.x+",j ="+j.x);
    }
    private static void swap(double a,double b ){
        Double temp=new Double();
        temp.x= a;
        a=b;
        b=temp.x;

    }
}
