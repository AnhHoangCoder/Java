package J05012;

public class MatHang {
    private String id, name;
    private int soLuong, ck;
    private long donGia;

    public MatHang(String id, String name, int soLuong, long donGia, int ck){
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ck = ck;
    }

    public long Total(){
        return donGia * soLuong - (long)ck;
    }

    @Override
    public String toString(){
        return String.format("%s %s %d %d %d %d", id, name, soLuong, donGia, ck, Total());
    }
}
