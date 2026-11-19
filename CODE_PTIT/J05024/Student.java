package J05024;

public class Student {
    private String id, name, lop, email;

    public Student(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id.substring(3, 7);
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, lop, email);
    }
}
