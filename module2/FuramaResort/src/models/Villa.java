package models;

import type.KieuThue;

import java.util.Scanner;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String dichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(dichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString() + "Villa{"
                + "tieuChuanPhong='" + tieuChuanPhong
                + '\''
                + ", dienTichHoBoi=" + dienTichHoBoi
                + ", soTang=" + soTang
                + '}';
    }

    public void input() {
        super.input();
        System.out.print("Nhập tiêu chuẩn phòng:");
        this.tieuChuanPhong = scanner.nextLine();
        System.out.print("Nhập diện tích hồ bơi:");
        this.dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số tầng:");
        this.soTang = Integer.parseInt(scanner.nextLine());
    }
}
