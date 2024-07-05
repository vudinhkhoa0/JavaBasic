package MAP;

public class NewKnowledge_Map {
    /*
        - Container lưu theo cặp key - value; mỗi giá trị của key sẽ ánh xạ sang value tương ứng, Map mạnh mẽ hơn Map
        - Tính chất: 
            Các key trong map là những giá trị riêng biệt, value có thể trùng nhau 
            Tìm kiếm nhanh 
            Dùng key làm index để truy cập value
            Trong java, chỉ lưu được Object
        - Áp dụng map: 
            Bài toán liên quan tần suất phần tử
            Tìm kiếm, thêm, xóa nhanh chóng 
            Dung map thay mảng đánh dấu khi dữ liệu không đẹp 
        - Map trong java:
            HashMap: 
                Cú pháp: 
                    Map<keyDataType, valueDataType> map = new HashMap<>();
                    HashMap<keyDataType, valueDataType> map = new HashMap<>();
                Hàm: 
                    put(key, value): Thêm cặp key, value vào map
                    size(): Trả về kích thước 
                    isEmpty()
                    clear()
                    containsKey(x): Kiểm tra x có tồn tại trong tập key 
                    containsValue(x): ----------------------------- value
                    get(x): Trả về value tương ứng với key x
                    remove(x): Xóa phần tử có key x 
                    replace(x, y): thay thế cặp phần từ có key x 
            LinkedHashMap: List Linked + Hash Table 
                ** Giống, chỉ khác có thứ tự 
            TreeMap: Cây đỏ đen, thứ tự tăng dần 
                ** Cú pháp: 
                    TreeMap<Integer, Integer> map = new TreeMap<>();
                ** Hàm: 
                    firstKey(): Trả về key đầu tiên trong map
                    lastKey(): ------------cuối cùng---------
                    firstEntry(): Trả về cặp phần tử đầu tiên trong map 
                    lastEntry(): Trả về cặp phần tử cuối cùng trong map 
                    floorKey(): Trả về key lớn nhất nhỏ hơn hoặc bằng x
                    floorEntry(): Trả về cặp phần tử key lớn nhất nhỏ hơn hoặc bằng x
                    ceilingKey(): Trả về key nhỏ nhất lớn hơn hoặc bằng x
                    ceilingEntry(): Trả về cặp phần tự có key nhỏ nhât lơn hơn hoặc bằng x
    */
}
