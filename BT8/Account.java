/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;

/**
 *
 *
 */
public abstract class Account {
    protected double balance;
    protected Mediator mediator;

    public Account(double balance) {
        this.balance = balance;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void withdraw(double amount) {
        if (mediator != null) {
            boolean success = mediator.requestWithdraw(this, amount);
            if (success) {
                System.out.println(getClass().getSimpleName() + " withdrew " + amount);
            } else {
                System.out.println(getClass().getSimpleName() + ": Withdrawal denied");
            }
        }
    }

    public abstract boolean isValidWithdraw(double balance, double amount);
}
