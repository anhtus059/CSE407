/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 
 */
class SavingsAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance - 100) {
            balance -= amount;
            System.out.println("Rut thanh cong: " + amount);
        } else {
            System.out.println("Khong the rut. So du sau khi rut phai >= 100.");
        }
    }
}

