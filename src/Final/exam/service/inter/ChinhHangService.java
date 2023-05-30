package Final.exam.service.inter;

import java.io.FileNotFoundException;

public interface ChinhHangService {
    void them() throws FileNotFoundException;
    void xoa();
    void xem() throws Exception;
    void timKiem();
}
