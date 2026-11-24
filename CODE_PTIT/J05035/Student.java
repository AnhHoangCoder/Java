package J05035;

public class Student {
    private int stt;
    private String id, name, lop, email, dn;

    public Student(int stt, String id, String name, String lop, String email, String dn){
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getId(){
        return id;
    }

    public String getDn(){
        return dn;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s", stt, id, name, lop, email, dn);
    }
}
