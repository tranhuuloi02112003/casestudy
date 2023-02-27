package models;

import type.LoaiKhachHang;

public class Customer extends Person {
    private String maKhachHang;
    private LoaiKhachHang loaiKhachHang;
    private String diaChi;

    public Customer() {
    }

    public Customer(String hoTen, String gioiTinh, String soCMND, String soDienThoai, String email, String maKhachHang, LoaiKhachHang loaiKhachHang, String diaChi) {
        super(hoTen, gioiTinh, soCMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public LoaiKhachHang getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return super.toString()+"Customer{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", loaiKhachHang=" + loaiKhachHang +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
//Loại khách, Địa chỉ (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
//Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).