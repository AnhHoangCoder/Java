package J07020;

public class khachHang {
    private static int stt = 0;
    private String maKH, nameKH, sex, date, addr;

    public khachHang(String name, String sex, String date, String addr) {
        stt++;
        this.maKH = String.format("KH%03d", stt);
        this.nameKH = name;
        this.sex = sex;

        String[] a = date.split("/");
        int m = Integer.parseInt(a[0]);
        int d = Integer.parseInt(a[1]);
        int y = Integer.parseInt(a[2]);

        this.date = String.format("%02d/%02d/%04d", d, m , y);
        this.addr = addr;
    }

    public String getMaKH(){
        return maKH;
    }

    public String getNameKH(){
        return nameKH;
    }

    public String getAddress(){
        return addr;
    }
}
