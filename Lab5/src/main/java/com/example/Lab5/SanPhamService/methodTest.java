package com.example.Lab5.SanPhamService;

import com.example.Lab5.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class methodTest {

    List<SanPham> sanPhams = new ArrayList<>();

    public methodTest() {
        sanPhams.add(new SanPham("01", "SP001", "Xe dua", 2000, "X", 30));
        sanPhams.add(new SanPham("02", "SP002", "Xe đạp", 3200, "M", 4));
        sanPhams.add(new SanPham("03", "SP003", "Xe 3 gác", 4300, "L", 3));
        sanPhams.add(new SanPham("04", "SP004", "Xe lăn", 3200, "XL", 5));
        sanPhams.add(new SanPham("05", "SP005", "Xe lu", 5500, "L", 7));
    }


    public List<SanPham> getSanPhams() {
        return sanPhams;
    }

    public String addProduct(SanPham sp) {
        try {
            Integer.valueOf(sp.getSoLuong());
            if (0 > sp.getSoLuong() || sp.getSoLuong() > 100) {
                return " 0  < Số lượng số nguyên dương < 100";
            }
            sanPhams.add(sp);
        } catch (Exception e) {
            return "Phải là số nguyên dương";
        }
        return "";
    }

    public String updateProductByID(String id, String maSP) {
        //Ko trùng mã sản phẩm + bắt đầu là SP
        for (int i = 0; i < getSanPhams().size(); i++) {
            if (getSanPhams().get(i).getId().equals(id)) {
                if (!maSP.startsWith("SP")) {
                    return "Mã sản phải bắt đầu bắt 'SP' ";
                } else if (getSanPhams().get(i).getMaSanPham().equals(maSP)) {//TH trùng mã
                    return "Mã sửa trùng với mã sản phẩm";
                }
                getSanPhams().get(i).setMaSanPham(maSP);
                return "Sửa giá sản phẩm thành công";
            }
        }
        return "Không tìm thấy sản phẩm để sửa";
    }

    public String deleteProduct(String maSP) {
        if (maSP != null) {
            for (SanPham sp : getSanPhams()) {
                if (sp.getMaSanPham().equals(maSP)) {
                    getSanPhams().remove(sp);
                    return "Xóa thành công";
                }
            }
        } else {
            return ("Nhập mã sản phẩm để xóa");
        }
        return "Không tìm thấy sản phẩm theo mã";
    }

}
