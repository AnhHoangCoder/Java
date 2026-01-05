package Home_work_class;

public class SinhVien {
    private String hoTen;

    private double diem;

    public SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem = diem;
    }

    @Override
    public String toString(){
        return hoTen + "// " + diem;
    }

    public void hienThiThongTin(){
        System.out.println(hoTen + " : " + diem);
    }
}
