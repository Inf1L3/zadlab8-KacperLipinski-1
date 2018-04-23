package pl.edu.ur.oopl8;

public class Tractor extends Produkt {

    public Tractor(double price, String name, String describe) {
        super(price,name,describe);
    }
  
    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    public static void main(String[] args){
        Produkt p1 = new Produkt(122, "ksiązka","fajna") {
            @Override
            public void buy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    p1.showInfo();
    Produkt p2 = new Produkt(122, "dzem","dobry") {
            @Override
            public void buy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    p2.showInfo();
    Produkt p3 = new Produkt(122, "polopiryna","skuteczna") {
            @Override
            public void buy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    p3.showInfo();
    Produkt p4 = new Produkt(122, "długopis","niebieski") {
            @Override
            public void buy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    p4.showInfo();
    Produkt p5 = new Produkt(122, "czekolada","smaczna") {
            @Override
            public void buy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    p5.showInfo();
}
}

