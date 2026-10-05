package J04012;

public class Employee {
    private static int stt = 0;
    private String maNV, hoTen, cv;
    private int luongCoBan, dayCong;

    public Employee(String hoTen, int luongCoBan, int dayCong, String cv){
        stt++;
        this.maNV = String.format("NV%02d", stt);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.dayCong = dayCong;
        this.cv = cv;
    }

    public int luongThang(){
        return luongCoBan * dayCong;
    }

    public int tienThuong(){
        if(dayCong >= 25){
            return 20 * luongThang() / 100;
        }
        else if(dayCong >= 22){
            return 10 * luongThang() / 100;
        }
        else{
            return 0;
        }
    }

    public int phuCap(){
        if(cv.equals("GD")){
            return 250000;
        }
        else if(cv.equals("PGD")){
            return 200000;
        }
        else if(cv.equals("TP")){
            return 180000;
        }
        else{
            return 150000;
        }
    }

    public int thuNhap(){
        return luongThang() + tienThuong() + phuCap();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(maNV).append(" ").append(hoTen).append(" ")
                .append(luongThang()).append(" ")
                .append(tienThuong()).append(" ")
                .append(phuCap()).append(" ")
                .append(thuNhap());
        return sb.toString();
    }
}
