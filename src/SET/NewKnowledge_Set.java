package SET;

public class NewKnowledge_Set {
    /*
        - Set:  Là container -> mỗi phần từ là duy nhất. Được cài đặt bằng bảng băm (Hash table) -> tốc độ tìm kiếm phần
                tự cực nhanh.
        - Áp dụng: 
            +   Xóa, thêm, tìm kiếm một phần tử nhiều lần
            +   Liên quan đến giá trị khác nhau
        - Set trong java có 3 lớp chính: 
            + HashSet: 
                ** Tính chất
                    Chỉ lưu đươc các phần tử khác nhau 
                    Được cài đặt bằng bảng băm, tốc độ tìm kiếm phần tử O(1)
                    Không có thứ tự, tức các phần tử có thể xuất hiện nhiều thứ tự bát kì
                    Chỉ lưu được phần tử kiểu đối tượng
                ** Cú pháp:
                    Set<dataType> set1 = new HashSet<>();
                    HashSet<dataType> set2 = new Hashset<>();
                ** Hàm: 
                    add(): Thêm phần tử vào set
                    remove(): Xóa phần tử khỏi set // Nguy cơ bị lỗi nếu phần tử không có trong set
                    size(): Trả về số lượng phần từ trong set
                    contains(): Kiểm tra sự tồn tại của 1 phần tử trong set 
                    clear(): Xóa mọi phần tử trong set
                    isEmpty(): Trả về true nếu set rổng, ngược lại trả về false 
            + LinkedHashSet: 
                ** Tính chất: 
                    Chỉ lưu được các phần tử khác nhau 
                    Được cài đặt bằng hash table && list linked, -> Tốc độ tìm kiếm O(1)
                    Có thứ tự, là thứ tự thêm các phần tử vào linkedHashSet
                    Chỉ lưu được phần tử kiểu đối tượng 
                ** Cú pháp:
                    Set<dataType> set1 = new LinkedHashSet<>();
                    HashSet<dataType> set2 = new LinkedHashset<>();
                ** Giống nhau, khác mỗi thêm listlinked + có thứ tự 
            + TreeSet: 
                ** Tính chất:  
                    Chỉ lưu được phần tử khác nhau 
                    Được cài bằng cây đỏ đen -(Red Black Tree), các hàm tìm kiếm, xóa của treeSet là logN
                    Có thứ tự tăng dần 
                    Chỉ lưu được các phần tử kiểu đối tượng 
                ** Cú pháp: 
                    TreeSet<dataType> set2 = new Treeset<>();
                ** Hàm: 
                    floor(x): Trả về phần tử lớn nhất <= x; -> null nếu không tồn tại 
                    ceiling(x): Trả về phần tử nhỏ nhất >= x; -> null nếu không tồn tại 
                    first(): trả về phần tử đầu tiên trong set 
                    last(): trả về phần tử cuối cùng trong set 
                    lower(x): Trả về phần tử lớn nhất nhỏ hơn x; -> null nếu không tồn tại
                    higher(x): trả về phần tử nhỏ nhất lớn hơn x;  -> null nếu không tồn tại  
    */
}
