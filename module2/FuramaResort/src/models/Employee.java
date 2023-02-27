package models;

import type.TrinhDo;
import type.ViTri;

public class Employee extends Person{
    private String maNhanVien;
    private TrinhDo trinhDo;
    private double luong;
    private ViTri viTri;

    public Employee() {
    }

    public Employee(String hoTen, String gioiTinh, String soCMND, String soDienThoai, String email, String maNhanVien, TrinhDo trinhDo, double luong, ViTri viTri) {
        super(hoTen, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.luong = luong;
        this.viTri = viTri;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", trinhDo=" + trinhDo +
                ", luong=" + luong +
                ", viTri=" + viTri +
                '}';
    }
}
