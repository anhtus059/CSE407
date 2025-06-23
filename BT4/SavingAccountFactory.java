/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 *
 */
public class SavingsAccountFactory implements AccountFactory {
    @Override
    public Account createAccount(double initialBalance) {
        return new SavingsAccount(initialBalance);
    }
}

