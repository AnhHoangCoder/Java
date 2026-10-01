package J07020;

public class matHang {
    private static int stt = 0;
    private String maMH, nameMH, dvt;
    private int buy, sell;

    public matHang(String nameMH, String dvt, int buy, int sell){
        stt++;
        this.maMH = String.format("MH%03d", stt);
        this.nameMH = nameMH;
        this.dvt = dvt;
        this.buy = buy;
        this.sell = sell;
    }

    public String getMaMH(){
        return maMH;
    }
    public String getNameMH(){
        return nameMH;
    }
    public String getDvt(){
        return dvt;
    }
    public int getBuy(){
        return buy;
    }
    public int getSell(){
        return sell;
    }
}
