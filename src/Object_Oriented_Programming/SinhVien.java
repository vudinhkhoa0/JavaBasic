package Object_Oriented_Programming;


public class SinhVien {
    private String name, dateOfBirth, address;
    private double gpa;
    private static int soLuong = 0;
    SinhVien(){
        this.name = "";
        this.dateOfBirth = "";
        this.address = "";
        this.gpa = 0;
        ++this.soLuong;
    }
    SinhVien(String name, String dateOfBirth, String address, double gpa) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;     
        this.gpa = gpa;   
        this.chuanHoa_dateOfBirth();
        this.chuanHoa_name();
        ++this.soLuong;
    }
    // Getter
    public String getName() {
        return this.name;
    }
    public String getDateOfBirth() { 
        return this.dateOfBirth;
    }
    public String getAddress() { 
        return this.address;
    }
    public double getGpa() {
        return this.gpa;
    }
    public static int getSoLuong() {
        return soLuong;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfBirth(String dateOfBirth) { 
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddress(String address) { 
        this.address = address;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // In 
    public void printInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Date Of Birth: " + this.dateOfBirth);
        System.out.println("Address: " + this.address);
        System.out.printf("GPA: %.1f", this.gpa);
        System.out.println();
    }
    // Chuẩn hóa ngày sinh
    public void chuanHoa_dateOfBirth() { 
        String s = "";
        String[] date = this.dateOfBirth.split("/");
        s += String.format("%02d", Integer.parseInt(date[0])) + '/';
        s += String.format("%02d", Integer.parseInt(date[1])) + '/';
        s += String.format("%04d", Integer.parseInt(date[2]));
        this.dateOfBirth = s;
    }
    // Chuẩn hóa ten
    public void chuanHoa_name() { 
        String s = "";
        String[] name = this.name.split("\\s+");
        for (String x : name) { 
            for (int i = 0; i < x.length(); ++i) {
                if (i == 0) s += Character.toUpperCase(x.charAt(i));
                else s += Character.toLowerCase(x.charAt(i));
            }
            s += ' ';
        }
        this.name = s;
    }
    // phương thức toString
    public String toString() { 
        return this.name + " " + this.dateOfBirth + " " + this.address + " " + this.gpa;
    }
}
