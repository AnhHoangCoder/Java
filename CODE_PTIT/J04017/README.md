Khai báo lớp Matrix mô tả ma trận các số nguyên.

Nhập ma trận A cấp N*M. Hãy viết chương trình tính tích của A với ma trận chuyển vị của A.

Input: Dòng đầu tiên ghi số bộ test. Với mỗi bộ test: Dòng đầu tiên ghi hai số n và m là bậc của ma trân a; n dòng tiếp theo, mỗi dòng ghi m  số của một dòng trong ma trận A.

n và m đều nguyên dương và nhỏ hơn 50. Các giá trị trong ma trận không vượt quá 100.

Output: Với mỗi bộ test ghi ra ma trận tích tương ứng, mỗi số cách nhau đúng một khoảng trống.

Ví dụ


Input	Output
1


2  2


1  2


3  4



5 11


11 25



Chú ý: Trong bài này cần viết hàm main đúng theo mô tả. 

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
int n = sc.nextInt(), m = sc.nextInt();
Matrix a = new Matrix(n,m);
a.nextMatrix(sc);
Matrix b = a.trans();
System.out.println(a.mul(b));
}
}