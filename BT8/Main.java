/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;

/**
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Account savings = new SavingsAccount(500);
        savings.setMediator(mediator);

        savings.withdraw(300); 
        savings.withdraw(150);
    }
}

