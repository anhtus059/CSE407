/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt9;

/**
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        AccountContext context = new AccountContext(1000);

        // Dùng SavingsStrategy
        context.setStrategy(new SavingsStrategy());
        context.doWithdraw(850);
        context.doWithdraw(800); 

        // Dùng LimitedDailyStrategy
        context.setStrategy(new LimitedDailyStrategy());
        context.doWithdraw(600);
        context.doWithdraw(400); 
    }
}
