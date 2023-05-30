package Final.exam.modell;

public class ChinhHang extends DienThoai {
    String thoiGian;
    String phamVi;

    public ChinhHang() {
    }
    public ChinhHang(int id, String ten, int gia, int soLuong, String nhaSanXuat, String thoiGian, String phamVi) {
        super(id, ten, gia, soLuong, nhaSanXuat);
        this.thoiGian = thoiGian;
        this.phamVi = phamVi;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getPhamVi() {
        return phamVi;
    }

    public void setPhamVi(String phamVi) {
        this.phamVi = phamVi;
    }

    @Override
    public String toString() {
        return "ChinhHang{" +
                "thoiGian='" + thoiGian + '\'' +
                ", phamVi='" + phamVi + '\'' +
                ", id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
    public String getInfor()
    {
        return id+","+ten+","+gia+","+soLuong+","+nhaSanXuat+","+thoiGian+","+phamVi;
    }
}
