package J05022;

public class Student {
    private String id, fullName, lop, email;

    public Student(String id, String fullName, String lop, String email) {
        this.id = id;
        this.fullName = fullName;
        this.lop = lop;
        this.email = email;
    }

    public String getLop(){
        return lop;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s", id, fullName, lop, email);
    }
}
