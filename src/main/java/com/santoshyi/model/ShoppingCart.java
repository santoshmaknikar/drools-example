package com.santoshyi.model;

/**
 * Created by Santosh Maknikar on 2/3/16.
 */
public class ShoppingCart {


    private Integer balance;

    public ShoppingCart() {
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public ShoppingCart(Integer balance) {
        super();
        this.balance = balance;
    }

    public void addtoCart(int money) {
        balance += money;
    }

}


