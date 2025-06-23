/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountFactory factory = new SavingsAccountFactory();
        Account account = factory.createAccount(500);

        account.withdraw(300); // Rút lần 1
        account.withdraw(300); // Rút lần 2

        System.out.println("Số dư còn lại: " + account.getBalance());
    }
}
