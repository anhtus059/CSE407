/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap7;

/**
 *
 * 
 */
public abstract class Account {
    protected AccountType accountType;
    protected double balance;

    public Account(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
