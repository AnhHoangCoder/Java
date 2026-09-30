package J07019;

public class HoaDon {
    private static int dem = 0;
    private int stt;
    private String mal;
    private long slm;
    private SanPham sp;

    public HoaDon(String maL, long num, SanPham sp){
        this.stt = ++dem;
        this.mal = maL;
        this.slm = num;
        this.sp = sp;
    }

    public String getLoai(){
        return mal.substring(mal.length() - 1);
    }

    public long thanhTien(){
        return slm * sp.getDonGia(getLoai());
    }

    public long giamGia(){
        long num = thanhTien();
        if(slm >= 150){
           return num * 50 / 100;
        }
        else if(slm >= 100){
            return num * 30 / 100;
        }
        else if(slm >= 50){
            return num * 15 / 100;
        }
        else{
            return 0;
        }
    }

    public long phaiTra(){
        return thanhTien() - giamGia();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(mal).append("-").append(String.format("%03d", stt))
                .append(" ").append(sp.getName()).append(" ")
                .append(giamGia()).append(" ").append(phaiTra());
        return sb.toString();
    }
}
