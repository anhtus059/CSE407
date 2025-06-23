/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 *
 */
public abstract class Account {
    private double balance;

    public Account(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance must be non-negative");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected void updateBalance(double amount) {
        this.balance = amount;
    }

    public abstract void withdraw(double amount);
}

