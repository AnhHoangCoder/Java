package J05014;

public class Teacher {
    private String stt, hoTen, id;
    private float tin, toan;

    public Teacher(String stt, String hoTen, String id, float tin, float toan){
        this.stt = stt;
        this.hoTen = hoTen;
        this.id = id;
        this.tin = tin;
        this.toan = toan;
    }

    public String getMH(){
        if(id.charAt(0) == 'A'){
            return "TOAN";
        }
        else if(id.charAt(0) == 'B'){
            return "LY";
        }
        else{
            return "HOA";
        }
    }

    public float Total(){
        float diemUt = 0;
        if(id.charAt(1) == '1'){
            diemUt = 2;
        }
        else if(id.charAt(1) == '2'){
            diemUt = 15.0f / 10;
        }
        else if(id.charAt(1) == '3'){
            diemUt = 1;
        }

        return tin * 2 + toan + diemUt;
    }

    public String kq(){
        float ans = Total();
        if(ans < 18){
            return "LOAI";
        }
        else{
            return "TRUNG TUYEN";
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %.1f %s", stt, hoTen, getMH(), Total(), kq());
    }
}
