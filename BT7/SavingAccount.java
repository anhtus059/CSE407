/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap7;

/**
 *
 *
 */
public class SavingsAccount implements AccountType {
    @Override
    public double withdraw(double balance, double amount) {
        if (balance - amount >= 100) {
            return balance - amount;
        } else {
            System.out.println("Không đủ tiền để rút (phải giữ lại ít nhất 100)");
            return balance;
        }
    }
}

