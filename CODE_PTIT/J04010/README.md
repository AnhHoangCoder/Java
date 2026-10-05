Khai báo lớp Point (điểm trong không gian hai chiều) có mô tả như sau:



Nhập 3 điểm p1, p2, p3. Hãy tính diện tích hình tròn ngoại tiếp tam giác tạo bởi 3 điểm trên.



Công thức Heron tính diện tích tam giác với 3 cạnh là a, b, c:



Công thức tính bán kính hình tròn ngoại tiếp:



Khi tính diện tích nên dùng hằng số PI trong lớp Math

Input

Dòng đầu ghi số bộ test (không quá 20).

Mỗi bộ test ghi trên 1 dòng 6 số thực lần lượt là tọa độ của 3 điểm A, B, C. Giá trị tọa độ không quá 1000.

Output

Nếu 3 điểm không thể tạo thành tam giác, in ra INVALID

Nếu 3 điểm tạo thành tam giác, in ra diện tích hình tròn ngoại tiếp với độ chính xác 3 số phần thập phân.

Ví dụ


Input

Output

3


0 0 0 5 0 199


1 1 1 1 1 1


0 0 0 5 5 0



INVALID


INVALID


39.270