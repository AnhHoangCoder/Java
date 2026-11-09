package J05009;

public class Student {
    private int maTs;
    private String hoTen, date;
    private double m1, m2, m3;

    public Student(int maTs, String hoTen, String date, double m1, double m2, double m3){
        this.maTs = maTs;
        this.hoTen = hoTen;
        this.date = date;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getMaTs() {
        return maTs;
    }

    public double total(){
        return m1 + m2 + m3;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s %.1f", maTs, hoTen, date, total());
    }
}
