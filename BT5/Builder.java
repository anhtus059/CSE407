/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package builderpattern;

/**
 *
 *
 */
public interface Builder {
    Builder setBalance(double balance);
    SavingsAccount build();


}
