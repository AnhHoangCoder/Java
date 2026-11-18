package J05023;

public class Student {
    private String id, name, lop, email;

    public Student(String id, String name, String lop, String email){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getYear(){
        return "20" + lop.substring(1,3);
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s", id, name, lop, email);
    }
}
