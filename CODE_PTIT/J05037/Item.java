package J05037;

public class Item {
    private String id, name, uom;
    private double pur;
    private int qtt;

    public Item(String id, String name, String uom, double pur, int qtt){
        this.id = id;
        this.name = name;
        this.uom = uom;
        this.pur = pur;
        this.qtt = qtt;
    }

    public long shFee(){
        return Math.round(pur * qtt * 0.05);
    }

    public long total(){
        return Math.round(pur * qtt + shFee());
    }

    public long sell(){
        return (long) (Math.ceil((1.02 * total() / qtt) / 100) * 100);
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %d %d %d", id, name, uom, shFee(), total(), sell());
    }
}
