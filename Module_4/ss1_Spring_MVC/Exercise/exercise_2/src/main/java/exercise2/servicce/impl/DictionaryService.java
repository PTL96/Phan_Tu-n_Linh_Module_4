package exercise2.servicce.impl;

import exercise2.servicce.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {

    @Override
    public String tiengViet(String tiengAnh) {
        String ketQua;
        switch (tiengAnh){
            case "red":
             ketQua = "màu đỏ";
                break;
            case "yellow":
                ketQua = "màu vàng";
                break;
            case "blue":
                ketQua = "màu xanh dương";
                break;
            default:
                ketQua = "không tìm thấy";
        }
        return ketQua;
    }
}
