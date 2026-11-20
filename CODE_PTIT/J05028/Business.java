package J05028;

public class Business {
    private String id, name;
    private int so;

    public Business(String id, String name, int so){
        this.id = id;
        this.name = name;
        this.so = so;
    }

    public int getSo(){
        return so;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, so);
    }
}
