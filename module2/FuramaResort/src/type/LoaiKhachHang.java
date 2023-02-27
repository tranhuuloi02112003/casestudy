package type;

import java.util.Scanner;

public enum LoaiKhachHang {
    Diamond,Platinium,Gold,Silver,Menber;
    public static LoaiKhachHang  loaiKhachHang(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("1.Diamond\t2.Platinium\t3.Gold\t4.Silver\t5.Menber");
        System.out.print("Chọn giá trị Loại Khách Hàng:");
        int select=Integer.parseInt(scanner.nextLine());
        switch (select){
            case 1:
                return LoaiKhachHang.Diamond;
            case 2:
                return LoaiKhachHang.Platinium;
            case 3:
                return LoaiKhachHang.Gold;
            case 4:
                return LoaiKhachHang.Silver;
            case 5:
                return LoaiKhachHang.Menber;
        }
        return null;
    }
}
