package models;

import type.KieuThue;

import java.util.Scanner;

public abstract class Facility {
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
    // Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    Scanner scanner= new Scanner(System.in);
    protected String dichVu,tenDichVu;
    protected double dienTichSuDung,chiPhiThue;
    protected int soLuongNguoiToiDa;
    protected KieuThue kieuThue;

    public Facility() {
    }

    public Facility(String dichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
        this.dichVu = dichVu;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    public void input(){
        System.out.print("Nhập dịch vụ");
        this.dichVu=scanner.nextLine();
        System.out.print("Nhập tên dịch vụ");
        this.tenDichVu=scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng:");
        this.dienTichSuDung=Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê:");
        this.chiPhiThue=Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng người ngồi:");
        this.soLuongNguoiToiDa=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá trị kiểu thuê:");
        this.kieuThue=KieuThue.giaTriKieuThue();
    }


    @Override
    public String toString() {
        return "Facility{"
                + "dichVu='" + dichVu + '\''
                +"tenDichVu"+dichVu+'\t'
                + ", dienTichSuDung=" + dienTichSuDung+'\t'
                + ", chiPhiThue=" + chiPhiThue+'\t'
                + ", soLuongNguoiToiDa=" + soLuongNguoiToiDa+'\t'
                +", kieuThue='" + kieuThue + '\''
                + '}';
    }
}
