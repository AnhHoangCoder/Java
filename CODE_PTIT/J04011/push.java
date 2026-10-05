package J04011;

import java.util.Scanner;

public class push {
    public static class Point3D {
        private int x, y, z;

        public Point3D(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
            long abx = b.x - a.x, aby = b.y - a.y, abz = b.z - a.z;
            long acx = c.x - a.x, acy = c.y - a.y, acz = c.z - a.z;
            long adx = d.x - a.x, ady = d.y - a.y, adz = d.z - a.z;

            long nx = aby * acz - abz * acy;
            long ny = abz * acx - abx * acz;
            long nz = abx * acy - aby * acx;

            long v = nx * adx + ny * ady + nz * adz;
            return v == 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
