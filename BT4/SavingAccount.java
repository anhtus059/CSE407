/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * 
 */
public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (amount <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        } else if (currentBalance - amount < 100) {
            System.out.println("Không thể rút. Số dư sau khi rút phải còn ít nhất 100.");
        } else {
            updateBalance(currentBalance - amount);
            System.out.println("Rút thành công: " + amount);
        }
    }
}

