/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt9;

/**
 *
 * 
 */
public class AccountContext {
    private double balance;
    private Strategy strategy;

    public AccountContext(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Số dư ban đầu không hợp lệ.");
        }
        this.balance = initialBalance;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean doWithdraw(double amount) {
        if (strategy == null) {
            System.out.println("Chưa đặt chiến lược rút tiền.");
            return false;
        }
        return strategy.withdraw(this, amount);
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        if (newBalance < 0) {
            throw new IllegalArgumentException("Số dư không được âm.");
        }
        this.balance = newBalance;
    }
}

