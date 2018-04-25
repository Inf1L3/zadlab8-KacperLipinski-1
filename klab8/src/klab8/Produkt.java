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
public abstract class Produkt {
private double price;
    private String name;
    private String describe;

    public double getPrice() {
        return price;
    }
public String getDescribe() {
        return describe;
    }
    
public String getName() {
        return name;
    }    
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy();

    public abstract void showInfo();  

    public Produkt(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }
    
    
}
