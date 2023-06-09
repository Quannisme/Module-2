package ss16.java.BT.bai2;

public class National {
    int id;
    String code;
    String name;

    public National(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public National() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "National{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
