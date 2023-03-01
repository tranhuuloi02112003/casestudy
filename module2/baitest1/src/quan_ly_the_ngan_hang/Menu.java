package quan_ly_the_ngan_hang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static String PATH="D:\\CG\\module2\\baitest1\\src\\quan_ly_the_ngan_hang\\card.txt";

    Scanner scanner= new Scanner(System.in);

    ChucNang chucNang= new ChucNang();
    public void disPlayMenu(){
        while (true) {
            try {
                System.out.println("----Menu----");
                System.out.println("1. Đăng ký thẻ");
                System.out.println("2. Xuất tất cả các thẻ đang có trong chương trình ra file card.txt" +
                        "\n" + "3. Đọc danh sách thẻ từ file card.txt" +
                        "\n" + "4. Thanh toán bằng thẻ   " +
                        "\n" + "5. Nộp tiền vào thẻ  " +
                        "\n" + "6. Tìm card (ATM hoặc Credit card) theo họ tên hoặc CMND/CCCD  " +
                        "\n" + "7. Huỷ thẻ (xoá thẻ)." +
                        "\n" + "8. Chuyển khoản" +
                        "\n" + "9. Thoát khỏi chương trình");
                System.out.println("Chọn chức năng");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        chucNang.dangKiThe();
                        break;
                    case 2:
                        chucNang.ghiFile(PATH);
                        break;
                    case 3:
                        for (TheNganHang l:chucNang.docFile(PATH)) {
                            l.showInfor();
                        }
                        break;
                    case 4:
                        chucNang.thanhToanBangThe();
                        break;
                    case 5:
                        chucNang.nopTien();
                        break;
                    case 6:
                        chucNang.timCard();
                        break;
                    case 7:
                        chucNang.huyThe();
                        break;
                    case 8:
                        chucNang.chuyenKhoan();
                        break;
                    case 9:
                        return;
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chọn chức năng là số");
            }
        }
    }


    public static void main(String[] args) {
        Menu menu= new Menu();
        menu.disPlayMenu();

    }
}
