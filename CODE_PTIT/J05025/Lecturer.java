package J05025;

public class Lecturer {
    private String id, name, department;

    public Lecturer(String id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepart(){
        return department;
    }

    public String getName(){
        String[] a =  name.split("\\s+");
        return a[a.length - 1];
    }

    public String Depart(){
        String ans = "";
        String[] a = department.toUpperCase().split("\\s+");
        for(int i = 0; i < a.length; i++){
            ans += a[i].charAt(0);
        }
        return ans;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", id, name, Depart());
    }
}
