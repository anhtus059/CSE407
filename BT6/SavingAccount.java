/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

/**
 *
 *
 */
public class SavingAccount implements Strategy {
    private double balance = 500;

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("SavingAccount: Withdrawn " + amount + ". Remaining: " + balance);
            return true;
        }
        System.out.println("SavingAccount: Withdrawal denied, minimum balance required.");
        return false;
    }
}
