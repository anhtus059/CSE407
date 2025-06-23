/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 */
class SavingsAccountBuilder implements Builder {
    private double balance;

    @Override
    public Builder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public SavingsAccount build() {
        return new SavingsAccount(balance);
    }
}

