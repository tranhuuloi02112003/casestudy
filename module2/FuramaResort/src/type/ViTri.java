package type;

import java.util.Scanner;

public enum ViTri {
    LeTan,PhucVu,ChuyenVien,GiamSat,QuanLy,GiamDoc;
    public static ViTri giaTriViTri(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("1.Lễ tân\t2.Phục vụ\t3.Chuyên viên\t4.Giám sát\t5.Quản lý\t6.Giám đốc");
        System.out.print("Chọn giá trị Vị Trí:");
        int select=Integer.parseInt(scanner.nextLine());
        switch (select){
            case 1:
                return ViTri.PhucVu;
            case 2:
                return ViTri.LeTan;
            case 3:
                return ViTri.ChuyenVien;
            case 4:
                return ViTri.GiamSat;
            case 5:
                return ViTri.QuanLy;
            case 6:
                return ViTri.GiamDoc;
        }
        return null;
    }

}
