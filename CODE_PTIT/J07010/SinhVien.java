package J07010;

public class SinhVien {
    private static int stt = 0;
    private String MaSv, hoTen, date, lop;
    private double gpa;

    public SinhVien(){
        this.MaSv = "";
        this.hoTen = "";
        this.lop = "";
        this.date = "";
        this.gpa = 0;
    }

    public void nhap(String hoTen, String lop, String date, double gpa){
        stt++;
        this.MaSv = String.format("B20DCCN%03d", stt);
        this.hoTen = hoTen;
        this.lop = lop;

        String[] a = date.split("/");
        int d = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int y = Integer.parseInt(a[2]);

        this.date = String.format("%02d/%02d/%d", d, m , y);
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String GPA = String.format("%.02f", gpa);
        sb.append(MaSv).append(" ").append(hoTen).append(" ").append(lop).append(" ")
        .append(date).append(" ").append(GPA).append("\n");
        return sb.toString();
    }
}
