package J05017;

public class Customer {
    private String id, name;
    private int oldIdx,  newIdx;

    public Customer(String id, String name, int oldIdx, int newIdx) {
        this.id = id;
        this.name = name;
        this.oldIdx = oldIdx;
        this.newIdx = newIdx;
    }

    public int Total(){
        int length = newIdx - oldIdx;
        int money = 0;
        double fee;
        if(length <= 50){
            money =  length * 100;
            fee = 1.02;
        }
        else if(length <= 100){
            money =  50 * 100 + (length - 50) * 150;
            fee = 1.03;
        }
        else{
            money = 50 * 100 + 50 * 150 + (length - 100) * 200;
            fee = 1.05;
        }
        return (int)Math.round(money * fee);
    }

    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, Total());
    }
}
