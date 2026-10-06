package J04018;

public class Complex {
    private int real, imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex multiply(Complex a, Complex b) {
        int Real = a.real * b.real - a.imag * b.imag;
        int Imag = a.real * b.imag + a.imag * b.real;
        return new Complex(Real, Imag);
    }

    @Override
    public String toString() {
        char tmp = '+';
        StringBuilder sb = new StringBuilder();
        sb.append(real).append(" ");
        if(imag < 0){
            tmp = '-';
        }
        sb.append(tmp).append(" ").append(Math.abs(imag)).append("i");
        return sb.toString();
    }
}
