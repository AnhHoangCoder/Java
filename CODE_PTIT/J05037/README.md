Cửa hàng tạp hóa cần tính toán các chi phí liên quan để quyết định giá bán. Mỗi mặt hàng có tên hàng, đơn vị tính, đơn giá nhập và số lượng. Các chi phí khác tính như sau:

Phí vận chuyển = (đơn giá nhập * số lượng) *5%. Cần làm tròn (round) đến hàng đơn vị.
Thành tiền = đơn giá nhập * số lượng + phí vận chuyển. Cần làm tròn (round) đến hàng đơn vị.
Giá bán = (Thành tiền + 2% Thành tiền)/số lượng. (ở đây giá bán được hiểu là giá bán lẻ từng sản phẩm, làm tròn lên đến đơn vị hàng trăm).
Hãy lập bảng tính toán giá bán lẻ cho cửa hàng.

Input

Dòng đầu ghi số mặt hàng (không quá 50)
Mỗi mặt hàng ghi trên 4 dòng lần lượt là: tên hàng, đơn vị tính, đơn giá nhập, số lượng.
Output

Ghi ra danh sách mặt hàng đã được sắp xếp theo giá bán lẻ giảm dần gồm các thông tin:

Mã hàng (tự động tăng theo thứ tự nhập, tính từ MH01)
Tên hàng
Đơn vị tính
Phí vận chuyển
Thành tiền
Giá bán lẻ
Ví dụ


Input

Output

4


DUONG


KG


7500


150


TRUNG


CHUC


10000


225


GAO


KG


14000


118


SUA


HOP


48000


430



MH04 SUA HOP 1032000 21672000 51500


MH03 GAO KG 82600 1734600 15000


MH02 TRUNG CHUC 112500 2362500 10800


MH01 DUONG KG 56250 1181250 8100

