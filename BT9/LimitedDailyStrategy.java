/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt9;


/**
 *
 */
public class LimitedDailyStrategy implements Strategy {
    @Override
    public boolean withdraw(AccountContext context, double amount) {
        if (amount > 500) {
            System.out.println("Rut that bai: Vuot qua gioi han 500 moi lan.");
            return false;
        }
        double balance = context.getBalance();
        if (balance < amount) {
            System.out.println("Rut that bai: Khong đu so du.");
            return false;
        }
        context.setBalance(balance - amount);
        System.out.println("Rut thanh cong. So du moi: " + context.getBalance());
        return true;
    }
}
