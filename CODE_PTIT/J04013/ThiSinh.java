package J04013;

public class ThiSinh {
    private String maTS, hoTen;
    private double toan, ly, hoa;

    public ThiSinh(String maTS, String hoTen, double toan, double ly, double hoa) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemUT(){
        String a = maTS.substring(0, 3);
        if(a.equals("KV1")){
            return 0.5;
        }
        else if(a.equals("KV2")){
            return 1.0;
        }
        else if(a.equals("KV3")){
            return 2.5;
        }
        else{
            return 0;
        }
    }

    public double tongDiem(){
        return toan * 2 + ly + hoa;
    }

    public String check(){
        double s = tongDiem() + diemUT();
        return (s >= 24) ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        double diemut = diemUT();
        double tongdiem = tongDiem();
        sb.append(maTS).append(" ").append(hoTen).append(" ")
                .append((diemut == (int)diemut) ? (int)diemut : String.format("%.1f", diemut)).append(" ")
                .append((tongdiem == (int)tongdiem) ? (int)tongdiem : String.format("%.1f", tongdiem)).append(" ")
                .append(check());
        return sb.toString();
    }
}
