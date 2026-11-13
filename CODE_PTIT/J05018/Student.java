package J05018;

public class Student {
    private String id, hoTen;
    private float score;

    public Student(String id, String hoTen, float m1, float m2, float m3, float m4, float m5, float m6, float m7, float m8, float m9, float m10){
        this.id = id;
        this.hoTen = hoTen;
        float avg = ((m1 * 2) + (m2 * 2) + m3 + m4 + m5
                + m6 + m7 + m8 + m9 + m10) / 12;

        this.score = Math.round(avg * 10) / 10.0f;
    }

    public String rank(){
        if(score < 5){
            return "YEU";
        }
        else if(score <= 6.9){
            return "TB";
        }
        else if(score <= 7.9){
            return "KHA";
        }
        else if(score <= 8.9){
            return "GIOI";
        }
        else {
            return "XUAT SAC";
        }
    }

    public float getScore(){
        return score;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString(){
        return String.format("%s %s %.1f %s", id, hoTen, score, rank());
    }
}
