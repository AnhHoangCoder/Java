package J05029;

public class Business {
    private String id, name;
    private int sl;

    public Business(String id, String name, int sl){
        this.id = id;
        this.name = name;
        this.sl = sl;
    }

    public int getSl(){
        return sl;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, sl);
    }
}