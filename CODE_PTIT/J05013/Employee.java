package J05013;

public class Employee {
    private String id, hoTen;
    private float lt, th;

    public Employee(String id, String hoTen, float lt, float th){
        this.id = id;
        this.hoTen = hoTen;

        while(lt > 10){
            lt /= 10;
        }

        while(th > 10){
            th /= 10;
        }
        this.lt = lt;
        this.th = th;
    }

    public float diemTb(){
        return (lt + th) / 2;
    }

    public String kq(){
        float ans = diemTb();
        if(ans < 5){
            return "TRUOT";
        }
        else if(ans < 8){
            return "CAN NHAC";
        }
        else if(ans < 9.5){
            return "DAT";
        }
        else{
            return "XUAT SAC";
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s %.2f %s", id, hoTen, diemTb(), kq());
    }
}
