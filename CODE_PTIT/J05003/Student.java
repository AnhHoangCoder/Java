package J05003;

public class Student {
    private String maSV, hoTen, date, lop;
    private double gpa;

    public Student(String maSV, String hoTen, String lop, String date, double gpa) {
        String[] tmp = date.split("/");
        int day = Integer.parseInt(tmp[0]);
        int month = Integer.parseInt(tmp[1]);
        int year = Integer.parseInt(tmp[2]);

        String dateNew = String.format("%02d/%02d/%04d", day, month, year);

        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.date = dateNew;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.maSV).append(" ").append(this.hoTen).append(" ")
                .append(this.lop).append(" ").append(this.date).append(" ")
                .append(String.format("%.2f", this.gpa)).append("\n");
        return str.toString();
    }
}
