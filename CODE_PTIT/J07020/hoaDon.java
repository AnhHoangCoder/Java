package J07020;

public class hoaDon {
    private static int stt = 0;
    private String maHD, maKH, maMH;
    private int soLuong;
    private khachHang KH;
    private matHang MH;

    public hoaDon(String maKH, String maMH, int soLuong, khachHang kh, matHang mh){
        stt++;
        this.maHD = String.format("HD%03d", stt);
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
        this.KH = kh;
        this.MH = mh;
    }

    public long thanhTien(){
         return (long)soLuong * MH.getSell();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(maHD).append(" ")
                .append(KH.getNameKH()).append(" ")
                .append(KH.getAddress()).append(" ")
                .append(MH.getNameMH()).append(" ")
                .append(MH.getDvt()).append(" ")
                .append(MH.getBuy()).append(" ")
                .append(MH.getSell()).append(" ")
                .append(soLuong).append(" ")
                .append(thanhTien());
        return sb.toString();
    }
}
