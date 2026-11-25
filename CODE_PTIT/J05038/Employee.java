package J05038;

public class Employee {
    private String id, name, cv;
    private long sal;
    private int qtt;

    public Employee(String id, String name, long sal, int qtt, String cv) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.qtt = qtt;
        this.cv = cv;
    }

    public long salMon(){
        return sal * qtt;
    }

    public long bonus(){
        if(qtt >= 25) return (long) (0.2 * salMon());
        if(qtt >= 22) return (long) (0.1 * salMon());
        return 0;
    }

    public int pc(){
        if(cv.equals("GD")) return 250000;
        if(cv.equals("PGD")) return 200000;
        if(cv.equals("TP")) return 180000;
        if(cv.equals("NV")) return 150000;
        return 0;
    }

    public long total(){
        return salMon() + bonus() + pc();
    }

    @Override
    public String toString(){
        return String.format("%s %s %d %d %d %d", id, name, salMon(), bonus(), pc(), total());
    }
}
