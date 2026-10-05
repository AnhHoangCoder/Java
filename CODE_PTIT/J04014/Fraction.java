package J04014;

public class Fraction {
    private long tu, mau;

    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    static long GCD(long a, long b) {
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    void rutGon(){
        long gcd = GCD(tu, mau);
        tu /= gcd;
        mau /= gcd;
    }

    public static Fraction mul(Fraction a, Fraction b) {
        return new Fraction(a.tu * b.tu, a.mau * b.mau);
    }

    public static Fraction C(Fraction a, Fraction b){
        long gcd = GCD(a.mau, b.mau);
        long lcm = a.mau / gcd * b.mau;

        long tu = a.tu * (lcm / a.mau) + b.tu  * (lcm / b.mau);
        Fraction c = new Fraction(tu, lcm);
        c.rutGon();

        Fraction res = mul(c, c);
        res.rutGon();
        return res;
    }

    public static Fraction D(Fraction a, Fraction b){
        Fraction c = C(a, b);
        Fraction e = mul(a, b);
        e.rutGon();

        Fraction res = mul(c, e);
        res.rutGon();
        return res;
    }

    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}
