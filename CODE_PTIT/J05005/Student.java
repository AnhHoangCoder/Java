package J05005;

public class Student {
    private String maSv, hoTen, lop, date;
    private double gpa;

    public Student(String maSv, String hoTen, String lop, String date, double gpa){
        String[] a = hoTen.trim().toLowerCase().split("\\s+");
        StringBuilder nameNew = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            nameNew.append(a[i]);
            if(i == a.length - 1){
                break;
            }
            nameNew.append(" ");
        }

        String[] b = date.split("/");
        int d = Integer.parseInt(b[0]);
        int m = Integer.parseInt(b[1]);
        int y = Integer.parseInt(b[2]);

        String dateNew = String.format("%02d/%02d/%04d", d, m, y);
        this.maSv = maSv;
        this.hoTen = nameNew.toString();
        this.lop = lop;
        this.date = dateNew;
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f", maSv, hoTen, lop, date, gpa);
    }
}
