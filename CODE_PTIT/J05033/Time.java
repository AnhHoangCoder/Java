package J05033;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long totalTime(){
        return hour * 60 * 60 + minute * 60 + second;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", hour, minute, second);
    }
}
