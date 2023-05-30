package Final.exam.modell;

public class XachTay extends DienThoai{
    String quocGia;
    String trangThai;

    public XachTay(String quocGia, String trangThai) {
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public XachTay(int id, String ten, int gia, int soLuong, String nhaSanXuat, String quocGia, String trangThai) {
        super(id, ten, gia, soLuong, nhaSanXuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "XachTay{" +
                "quocGia='" + quocGia + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
    public String getInfor()
    {
        return id+","+ten+","+gia+","+soLuong+","+nhaSanXuat+","+trangThai+","+quocGia;
    }
}
