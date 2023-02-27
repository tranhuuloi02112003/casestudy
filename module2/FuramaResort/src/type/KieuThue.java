package type;

import java.util.Scanner;

public enum KieuThue {
    nam, thang, ngay, gio;

    public static KieuThue giaTriKieuThue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Năm\t2.Tháng\t3.Ngày\t4.Giờ");
        System.out.print("Chọn giá trị kiểu thuê:");
        int chonKieuThue =Integer.parseInt(sc.nextLine());
        switch (chonKieuThue) {
            case 1:
                return KieuThue.nam;
            case 2:
                return KieuThue.thang;
            case 3:
                return KieuThue.ngay;
            case 4:
                return KieuThue.gio;
        }
        return null;
    }
}
