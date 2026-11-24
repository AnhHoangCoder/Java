package J05036;

public class Item {
    private String id, name, uom;
    private double ship, total, sell;

    public Item(String id, String name, String uom, double pur, double quantity){
        this.id = id;
        this.name = name;
        this.uom = uom;

        this.ship = Math.ceil(pur * quantity * 0.05);
        this.total = Math.ceil(pur * quantity + ship);
        this.sell = 1.02 * total;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %.0f %.0f %.0f", id, name, uom, ship, total, sell);
    }
}
