Viết chương trình khai báo lớp Matrix mô tả ma trận các số nguyên.

Sau đó nhập và tính tích hai ma trận A cỡ n*m và ma trận B cỡ m*p.

Với 1 < n,m,p < 50. Các giá trị trong ma trận đều nguyên dương và không vượt quá 1000.

Input

Dòng đầu ghi 3 số n,m,p

n dòng tiếp theo ghi ma trận A

m dòng tiếp theo ghi ma trận B

Output

Ghi ra ma trận tích

Ví dụ


Input

Output

3 4 3


1 2 3 4


4 2 3 1


2 4 1 3


1 1 1


2 2 2


3 3 3


4 4 4



30 30 30


21 21 21


25 25 25



Chú ý: Trong bài này cần viết hàm main đúng theo mô tả.

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
Matrix a = new Matrix(n,m);
a.nextMatrix(sc);
Matrix b = new Matrix(m,p);
b.nextMatrix(sc);
System.out.println(a.mul(b));
}