Cho N xâu S[1], S[2], …, S[N] có độ dài bằng nhau. Mỗi bước, với xâu T, bạn được phép xoay vòng 1 kí tự, tức lấy kí tự đầu tiên của T rồi chuyển xuống cuối. Ví dụ xâu “cool” sẽ chuyển thành “oolc”.

Bạn cần phải xoay N xâu sao cho tất cả chúng đều giống nhau. Hãy xác định số bước ít nhất để hoàn thành được công việc này?

Input:

Mỗi test bắt đầu bởi số nguyên N (1 ≤ N ≤ 50).

N dòng tiếp theo, mỗi dòng gồm xâu S[i] có độ dài không quá 50.

Output:

Với mỗi test, in ra số bước ít nhất tìm được, nếu không thể biến đổi, hãy in ra -1.



Ví dụ:


Test 1

Test 2

Test 3

Test 4

Input:


4


xzzwo


zwoxz


zzwox


xzzwo





Output:


5






Input:


2


molzv


lzvmo











Output:


2






Input:


3


kc


kc


kc








Output:


0






Input:


3


aa


aa


ab








Output:


-1







Giải thích test 1: Xoay tất cả các xâu thành “zwoxz”.