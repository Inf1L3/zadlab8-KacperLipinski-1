package pl.edu.ur.oopl8;

public abstract class Produkt {

    private double price;
    private String name;
    private String describe;

    public Produkt(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy();

    public void showInfo(){
        System.out.println("");
        System.out.println("cena: "+ this.price);
        System.out.println("nazwa: "+ this.name);
        System.out.println("opis: "+ this.describe);
        
}
}