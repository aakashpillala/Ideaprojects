package com.stark;

public class calculator {


    public int cal(int a, int b, char op) {
        int res = 0;

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                }
                break;
            default:
                System.out.println("undefined operator is used");
        }
        return res;    }

}
