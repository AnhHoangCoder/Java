package J05004;

public class Student {
    private String maSv, hoTen, lop, date;
    private double gpa;

    public Student(String maSv, String hoTen, String lop, String date, double gpa){
        hoTen = hoTen.replaceAll("\\s+", " ");
        String[] a = hoTen.toLowerCase().split(" ");
        for(int i = 0; i < a.length; i++){
            a[i] = Character.toUpperCase(a[i].charAt(0)) +  a[i].substring(1);
        }

        StringBuilder name = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            name.append(a[i]);
            if(i == a.length - 1){
                break;
            }
            name.append(" ");
        }

        String[] b = date.split("/");
        int day = Integer.parseInt(b[0]);
        int month = Integer.parseInt(b[1]);
        int year = Integer.parseInt(b[2]);

        String dateNew = String.format("%02d/%02d/%04d", day, month, year);
        this.maSv = maSv;
        this.hoTen = name.toString();
        this.lop = lop;
        this.date = dateNew;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(maSv).append(" ").append(hoTen).append(" ")
                .append(lop).append(" ").append(date).append(" ")
                .append(String.format("%.2f", gpa)).append("\n");
        return sb.toString();
    }
}
