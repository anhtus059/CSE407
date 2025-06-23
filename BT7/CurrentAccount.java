/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap7;

/**
 *

 */
public class CurrentAccount implements AccountType {
    @Override
    public double withdraw(double balance, double amount) {
        // Cho phép âm tối đa -500
        if (balance - amount >= -500) {
            return balance - amount;
        } else {
            System.out.println("Vượt quá hạn mức cho phép (-500)");
            return balance;
        }
    }
}

