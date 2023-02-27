package models;

import type.KieuThue;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String dichVuMienPhiDiKem) {
        super(dichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public void input(){
        super.input();
        System.out.print("Nhập DV free đi kèm:");
        this.dichVuMienPhiDiKem=scanner.nextLine();
    }
    @Override
    public String toString() {
        return super.toString()
                +"Room{" +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                '}';
    }
}
