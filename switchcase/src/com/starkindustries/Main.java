package com.starkindustries;

public class  Main {

    public static void main(String[] args) {
        String band = "jio";
        switch (band) {
            case "jio":
                System.out.println("band is jio");
                break;
            case "airtel":
                System.out.println("colour is red");
                break;
            case "amd":
                System.out.println("colour is black");
                break;
            default:
                System.out.println("colour selected is out of range");
                break;
        }
    }
}