package J05010;

public class MatHang {
    private int maMh;
    private String name, group;
    private double buy, pass;

    public MatHang(int maMh, String name, String group,
                   double buy, double pass) {
        this.maMh = maMh;
        this.name = name;
        this.group = group;
        this.buy = buy;
        this.pass = pass;
    }

    public double loiNhuan() {
        return pass - buy;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f",
                maMh, name, group, loiNhuan());
    }
}
