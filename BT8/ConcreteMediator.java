/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;

/**
 *
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    @Override
    public boolean requestWithdraw(Account account, double amount) {
        if (account.isValidWithdraw(account.getBalance(), amount)) {
            account.setBalance(account.getBalance() - amount);
            return true;
        }
        return false;
    }
}

