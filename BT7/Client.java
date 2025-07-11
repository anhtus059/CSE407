/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap7;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        AccountType savings = new SavingsAccount();
        Account user1 = new UserAccount(savings, 1000);
        user1.withdraw(950); // Fail
        user1.withdraw(800); // OK
        System.out.println("Số dư tài khoản tiết kiệm: " + user1.getBalance());

        AccountType current = new CurrentAccount();
        Account user2 = new UserAccount(current, 200);
        user2.withdraw(600); // OK
        user2.withdraw(200); // Fail
        System.out.println("Số dư tài khoản thanh toán: " + user2.getBalance());
    }
}
