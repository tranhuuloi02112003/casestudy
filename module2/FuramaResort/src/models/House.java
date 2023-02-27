package models;

import type.KieuThue;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String dichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String tieuChuanPhong, int soTang) {
        super(dichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public void input(){
        super.input();
        System.out.print("Nhập tiêu chuẩn phòng:");
        this.tieuChuanPhong=scanner.nextLine();
        System.out.print("Nhập số tầng:");
        this.soTang=Integer.parseInt(scanner.nextLine());
    }

        @Override
    public String toString() {
        return super.toString()
                +"House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
