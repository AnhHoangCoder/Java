public class Main{
    public static void main(String[] a){
        int i1 = 2 , i2 = 5 , i3 = -3;
        double d1 = 2.0 , d2 = 5.0 , d3 = -0.5;

        System.out.println("Câu a : " + (i1 + (i2*i3)));
        System.out.println("Câu b : " + (i1 * (i2+i3)));
        System.out.println("Câu c : " + (double)(i1 / (i2+i3)));
        System.out.println("Câu d : " + ((double)i1 / i2 + i3));
        System.out.println("Câu e : " + (3 + 4 + (double)(5 / 3)));
        System.out.println("Câu g : " + ((double)(3 + 4 + 5) / 3));
        System.out.println("Câu k : " + (d1 + (d2 * d3)));
        System.out.println("Câu l : " + (d1 + d2 * d3));
        System.out.println("Câu m : " + (d1 / d2 - d3));
        System.out.println("Câu n : " + (d1 / (d2 - d3)));
        System.out.println("Câu o : " + ((d1 + d2 + d3) / 3));
        System.out.println("Câu r : " + (3 * (d1 + d2) * (d1 - d3)));
    }
}