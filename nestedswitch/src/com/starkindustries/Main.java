package com.starkindustries;

public class Main {

    public static void main(String[] args) {
	// nested switch
        int a=1;
        int b=2;
        switch(a){
            case 1:
                System.out.println("value of a is 1");
                switch(b){
                    case 1:
                        System.out.println("value of b is 1");
                        break;
                    case 2:
                        System.out.println("value of b" +
                                "" +
                                "" +
                                "" +
                                " is 2");
                        break;
                    default:
                        System.out.println("value is invalid");
                }
                break;
            case 2:
                System.out.println("value of a is 2");
                break;
            default:
                System.out.println("value is invalid");
        }

    }
}
