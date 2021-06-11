package com.stark;

public class Main {

    public static void main(String[] args) {
	bank customer;
	customer=new bank();
	customer.create_account();
	customer.setMoney(500);
	customer.setAccount_balancce(0);
	customer.add_money();
	customer.send_money();
	customer.show_balance();



    }
}
