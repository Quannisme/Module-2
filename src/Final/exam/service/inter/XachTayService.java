package Final.exam.service.inter;

import java.io.FileNotFoundException;

public interface XachTayService {
    void them() throws FileNotFoundException;
    void xoa();
    void xem() throws Exception;
    void timkiem();
}
