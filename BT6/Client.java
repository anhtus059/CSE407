/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

/**
 *

 */
public class Client {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doWithdraw(double amount) {
        if (strategy.withdraw(amount)) {
            System.out.println("Client: Withdrawal succeeded.");
        } else {
            System.out.println("Client: Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();

        // Sử dụng chiến lược SavingAccount
        client.setStrategy(new SavingAccount());
        client.doWithdraw(300);

        // Sử dụng ExternalService qua Adapter
        client.setStrategy(new Adapter(new ExternalService()));
        client.doWithdraw(200);
    }
}

