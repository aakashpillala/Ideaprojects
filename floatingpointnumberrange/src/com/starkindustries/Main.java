package com.starkindustries;

public class Main {

    public static void main(String[] args) {
	int num=-5;
	if(num==0){
	    System.out.println("given number is zero");

    }
	else if(num>0){
	    System.out.println("number is positive ");
    }else
        System.out.println("number is negative");
	    if(num<1){
	        System.out.println("number is small");
        }else if(num>100000)
            System.out.println("number is large");
    }
}
