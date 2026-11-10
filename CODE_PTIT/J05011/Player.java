package J05011;

public class Player {
    private String id, name, in, out;
    public Player(String id, String name, String in, String out){
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
    }

    public int toMinutes(String times){
        String[] parts = times.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }

    public int gamePlay(){
        return toMinutes(out) - toMinutes(in);
    }

    @Override
    public String toString() {
        int ans = gamePlay();
        return String.format("%s %s %d gio %d phut", id, name, ans/60, ans%60);
    }
}
