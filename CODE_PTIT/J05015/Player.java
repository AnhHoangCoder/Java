package J05015;

public class Player {
    private String id, hoTen, donVi, timeEnd;

    public Player(String hoTen, String donVi, String timeEnd) {
        String[] parts1 = hoTen.split(" ");
        String[] parts2 = donVi.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String s : parts2) {
            sb.append(s.charAt(0));
        }

        for (String s : parts1) {
            sb.append(s.charAt(0));
        }

        this.id = sb.toString();
        this.hoTen = hoTen;
        this.donVi = donVi;
        this.timeEnd = timeEnd;
    }

    public int toMinutes(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        return h * 60 + m;
    }

    public int getTimeEnd() {
        return toMinutes(timeEnd);
    }

    public int vtTB() {
        int timeLine = getTimeEnd() - toMinutes("6:00");

        return Math.round(120.0f * 60 / timeLine);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d Km/h",
                id, hoTen, donVi, vtTB());
    }
}
