package J04011;

public class Point3D {
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
