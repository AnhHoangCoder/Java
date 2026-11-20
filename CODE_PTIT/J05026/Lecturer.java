package J05026;

public class Lecturer {
    private String id, name, dpm;
    public Lecturer(String id, String name, String dpm){
        this.id = id;
        this.name = name;
        this.dpm = dpm;
    }

    public String DPM(){
        String ans = "";
        String[] a = dpm.toUpperCase().split("\\s+");
        for(int i = 0; i < a.length; i++){
            ans += a[i].charAt(0);
        }
        return ans;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", id, name, DPM());
    }
}
