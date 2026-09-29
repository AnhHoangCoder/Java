package J07018;

public class SinhVien {
    public static int stt = 0;
    private String MaSv, hoTen, date, lop;
    private double gpa;

    public SinhVien(){
        this.MaSv = "";
        this.hoTen = "";
        this.date = "";
        this.lop = "";
        this.gpa = 0;
    }

    public SinhVien(String hoTen, String lop, String date, double gpa){
        stt++;
        String s = String.format("B20DCCN%03d", stt);
        this.MaSv = s;

        String name = hoTen.trim().toLowerCase();
        String[] a = name.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            String tmp = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            sb.append(tmp);
            if(i < a.length - 1){
                sb.append(" ");
            }
        }
        this.hoTen = sb.toString();

        String[] b = date.split("/");
        int d = Integer.parseInt(b[0]);
        int m = Integer.parseInt(b[1]);
        int y = Integer.parseInt(b[2]);

        this.date = String.format("%02d/%02d/%04d", d, m ,y);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        String GPA = String.format("%.2f", gpa);
        sb.append(MaSv).append(" ").append(hoTen).append(" ").append(lop).append(" ").append(date).append(" ").append(GPA);
        return sb.toString();
    }
}
