/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap7;

/**
 *
 * 
 */
public class UserAccount extends Account {
    public UserAccount(AccountType accountType, double balance) {
        super(accountType, balance);
    }

    @Override
    public void withdraw(double amount) {
        balance = accountType.withdraw(balance, amount);
    }
}
