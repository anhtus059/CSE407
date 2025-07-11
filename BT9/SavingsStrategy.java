/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt9;



/**
 *
 *
 */
public class SavingsStrategy implements Strategy {
    public boolean withdraw(AccountContext context, double amount) {
        double balance = context.getBalance();
        if (balance - amount < 100) {
            System.out.println("Rút thất bại: Phải giữ lại ít nhất 100.");
            return false;
        }
        context.setBalance(balance - amount);
        System.out.println("Rút thành công. Số dư mới: " + context.getBalance());
        return true;
    }

    
}
