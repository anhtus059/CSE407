/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

import java.util.Scanner;

/**
 *
 * 
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new SavingsAccountBuilder();

        System.out.print("Nhap so du ban dau: ");
        double initialBalance = scanner.nextDouble();

        SavingsAccount account = builder
            .setBalance(initialBalance)
            .build();

        System.out.println("Tai khoan duoc tao voi so du: " + account.getBalance());

        for (int i = 1; i <= 2; i++) {
            System.out.print("Nhap so tien muon rut lan " + i + ": ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println("So du hien tai: " + account.getBalance());
        }

        scanner.close();
    }
}
