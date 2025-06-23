/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 *
 */
public class Director {
    public void makeStandardAccount(Builder builder) {
        builder.setBalance(500);
    }

    public void makeDeluxeAccount(Builder builder) {
        builder.setBalance(1000);
    }
}

