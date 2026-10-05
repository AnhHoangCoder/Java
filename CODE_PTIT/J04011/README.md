Cho 4 điểm trong không gian 3 chiều. Nhiệm vụ của bạn là kiểm tra xem chúng có cùng nằm trên một mặt phẳng hay không? Nếu có in ra “YES”, in ra “NO” trong trường hợp ngược lại.

Input:

Dòng đầu tiên là số lượng bộ test T (T ≤ 10000).

Mỗi test gồm 4 dòng, lần lượt là tọa độ nguyên x[i], y[i], z[i] của các điểm.

(-1000 ≤ x[i], y[i], z[i] ≤ 1000).

Output:

Với mỗi test, in ra đáp án tìm được trên một dòng.


Input:

Output

3


1 2 0


2 3 0


4 0 0


0 0 0


1 1 1


2 2 2


3 3 3


4 4 4


5 6 7


-8 -9 -10


12 19 0


3 1 5






YES


YES


NO

Hàm main cố định

public static void main(String[] args) {
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