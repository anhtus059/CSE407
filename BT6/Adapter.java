/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

/**
 *
 */
public class Adapter implements Strategy {
    private ExternalService service;

    public Adapter(ExternalService service) {
        this.service = service;
    }

    @Override
    public boolean withdraw(double amount) {
        return service.performWithdraw(amount);
    }
}
