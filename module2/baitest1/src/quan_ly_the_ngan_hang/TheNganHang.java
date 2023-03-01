package quan_ly_the_ngan_hang;

import java.io.Serializable;
import java.util.Scanner;

public abstract class TheNganHang implements Serializable {
    Scanner scanner = new Scanner(System.in);
    protected String soThe, tenChuThe, cCCD, diaChi;

    public TheNganHang() {
    }

    public TheNganHang(String soThe, String tenChuThe, String cCCD, String diaChi) {
        this.soThe = soThe;
        this.tenChuThe = tenChuThe;
        this.cCCD = cCCD;
        this.diaChi = diaChi;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getTenChuThe() {
        return tenChuThe;
    }

    public void setTenChuThe(String tenChuThe) {
        this.tenChuThe = tenChuThe;
    }

    public String getcCCD() {
        return cCCD;
    }

    public void setcCCD(String cCCD) {
        this.cCCD = cCCD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void input() {
        System.out.print("Nhập số thẻ:");
        this.soThe = scanner.nextLine();
        while (!this.soThe.matches("\\d{12}")) {
            System.out.println("Vui lòng nhập lại số thẻ (gồm 12 số):");
            this.soThe = scanner.nextLine();
        }
        System.out.print("Nhập tên chủ thẻ::");
        this.tenChuThe = scanner.nextLine();
        System.out.print("Nhập CCCD:");
        this.cCCD = scanner.nextLine();
        System.out.print("Nhập địa chỉ:");
        this.diaChi = scanner.nextLine();


    }

    public abstract void showInfor();

    @Override
    public String toString() {
        return getSoThe() + "," + getTenChuThe() + "," + getcCCD() + "," + getDiaChi();
    }
}
