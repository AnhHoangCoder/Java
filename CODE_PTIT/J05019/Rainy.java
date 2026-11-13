package J05019;

public class Rainy {
    private String id, name;
    private long totalMinutes, totalRain;

    public void addMinutes(long totalMinutes) {
        this.totalMinutes += totalMinutes;
    }

    public void addRain(long totalRain) {
        this.totalRain += totalRain;
    }

    public Rainy(int id, String name, long totalMinutes, long totalRain) {
        this.id = String.format("T%02d", id);
        this.name = name;
        this.totalMinutes = totalMinutes;
        this.totalRain = totalRain;
    }

    public double rainAvg(){
        return totalRain * 60.0 / totalMinutes;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", id, name, rainAvg());
    }
}
