/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klab8;

/**
 *
 * @author student
 */
public class czekolada extends Produkt {

    public czekolada(double price, String name, String describe) {
        super(price, name, describe);
    }
    
    public void buy() {
        System.out.println(
                "Kupiono czekolade");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
}    
    
}
