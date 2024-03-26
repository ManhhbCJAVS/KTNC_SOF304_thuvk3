import com.example.Lab5.SanPhamService.methodTest;
import com.example.Lab5.entity.SanPham;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class testCase {

    methodTest method = new methodTest();
    List<SanPham> sanPhams = method.getSanPhams();

    @Test
    public void testProductAdd() {
        SanPham sp = new SanPham("06", "SP006", "Áo lụa", 4000, "XXL", 30);
        method.addProduct(sp);
        Assertions.assertTrue(sanPhams.contains(sp));//Pass
//        Assertions.assertTrue(!sanPhams.contains(sp));//Faile
    }

    @Test
    public void testValidProductAdd() {
        SanPham validSP = new SanPham("06", "SP006", "Áo lụa", 4000, "XXL", 5000);
        Assertions.assertEquals(" 0  < Số lượng số nguyên dương < 100", method.addProduct(validSP));//Pass
//        Assertions.assertEquals("" ,method.addProduct(validSP) );//Failse
    }


    @Test
    public void testDeleteProduct() {
        Assertions.assertEquals(method.deleteProduct("SP001"), "Xóa thành công");//Pass
//        Assertions.assertEquals( method.deleteProduct(null) , "Nhập mã sản phẩm để xóa");//Pass
//        Assertions.assertEquals( method.deleteProduct("SP04343") , "Không tìm thấy sản phẩm theo mã");//Pass

//        Assertions.assertEquals( method.deleteProduct("SP001") , null);//Fail
    }

    @Test
    public void testUpdatePorudct() {
        Assertions.assertEquals(method.updateProductByID("01", "SP006"), "Sửa giá sản phẩm thành công");//Pass
//        Assertions.assertEquals(method.updateProductByID("01", "05SP43"), "Mã sản phải bắt đầu bắt 'SP' ");//Pass
//        Assertions.assertEquals(method.updateProductByID("01","SP001" ), "Mã sửa trùng với mã sản phẩm");//Pass

//        Assertions.assertEquals(method.updateProductByID("02" , "SP001"), null);//Failse
    }

}
