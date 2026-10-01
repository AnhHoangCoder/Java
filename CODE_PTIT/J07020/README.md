Khai báo lớp Khách hàng với các thuộc tính:

Mã khách hàng: tự động tăng, tính từ KH001
Tên khách hàng: xâu ký tự độ dài không quá 50
Giới tính: Nam hoặc Nu
Ngày sinh: Theo đúng chuẩn dd/mm/yyyy
Địa chỉ: xâu ký tự độ dài không quá 100
Khai báo lớp Mặt hàng với các thuộc tính:

Mã mặt hàng: tự động tăng, tính từ MH001
Tên mặt hàng: xâu ký tự độ dài không quá 100
Đơn vị tính: xâu ký tự độ dài không quá 10
Giá mua: số nguyên dương không quá 7 chữ số
Giá bán: số nguyên dương không quá 7 chữ số
Khai báo lớp Hóa đơn trong đó có các thông tin:

Mã hóa đơn
Khách hàng
Mặt hàng
Số lượng (không quá 1000)
Viết chương trình nhập danh sách hóa đơn và in danh sách ra màn hình.

Input - có 3 file văn bản

File KH.in

Dòng đầu ghi số N là số khách hàng (không quá 20).

Tiếp theo là thông tin của N khách hàng, mỗi khách hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)

File MH.in

Dòng đầu ghi số M là số mặt hàng (không quá 40).

Tiếp theo là thông tin của M mặt hàng, mỗi mặt hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)



File HD.in

Dòng đầu theo ghi số K là số hóa đơn (không quá 100)

Mỗi hóa đơn ghi trên 1 dòng gồm 3 thông tin theo đúng thứ tự đã mô tả (không có mã).

Output

Ghi ra danh sách hóa đơn theo đúng thứ tự nhập, trong đó gồm các thông tin sau, mỗi thông tin cách nhau đúng một khoảng trống.

Mã hóa đơn
Tên khách hàng
Địa chỉ
Tên mặt hàng
Đơn vị tính
Giá mua
Giá bán
Số lượng
Thành tiền
Ví dụ


Input

File KH.in


2


Nguyen Van Nam


Nam


12/12/1997


Mo Lao-Ha Dong-Ha Noi


Tran Van Binh


Nam


11/14/1995


Phung Khoang-Nam Tu Liem-Ha Noi





File MH.in


2


Ao phong tre em


Cai


25000


41000


Ao khoac nam


Cai


240000


515000





File HD.in


3


KH001 MH001 2


KH001 MH002 3


KH002 MH002 4




Output



HD001 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao phong tre em Cai 25000 41000 2 82000


HD002 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao khoac nam Cai 240000 515000 3 1545000


HD003 Tran Van Binh Phung Khoang-Nam Tu Liem-Ha Noi Ao khoac nam Cai 240000 515000 4 2060000

