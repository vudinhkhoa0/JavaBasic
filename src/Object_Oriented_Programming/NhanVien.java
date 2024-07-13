package Object_Oriented_Programming;

public class NhanVien {
    private String id, name;
    private int luongCoBan, ngayCong;
    private String chucVu;
    NhanVien(String id, String name, int luongCoban, int ngayCong, String chucVu) {
        this.id = id;
        this.name = name;
        this.luongCoBan = luongCoban;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    public int getLuong() { 
        return this.luongCoBan * this.ngayCong;
    }
    public int getThuong() { 
        int luong = this.getLuong();
        if (this.ngayCong >= 25) { 
            return (int)(0.2 * luong);
        }
        else if (this.ngayCong >= 22) {
            return (int)(0.1 * luong);
        }
        else return 0;
    }
    public int getPhuCap() { 
        if (this.chucVu.equals("GD")) {
            return 250000;
        }
        else if (this.chucVu.equals("PGD")) {
            return 200000;
        }
        else if (this.chucVu.equals("TP")) {
            return 180000;
        }
        else {
            return 150000;
        }
    }
    public String toString() { 
        return this.id + " " + this.name + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + (this.getLuong() + this.getThuong() + this.getPhuCap()); 
    }
}
