package J07019;

public class SanPham {
    private String maL, name;
    private long gia1, gia2;

    public SanPham(String ma, String name, long gia1, long gia2) {
        this.maL = ma;
        this.name = name;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    public long getDonGia(String loai){
        return ((loai.equals("1")) ? gia1 : gia2);
    }

    public String getMa(){
        return maL;
    }

    public String getName(){
        return name;
    }
}
