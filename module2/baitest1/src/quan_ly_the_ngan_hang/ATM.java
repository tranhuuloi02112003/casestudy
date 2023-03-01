package quan_ly_the_ngan_hang;

public class ATM extends TheNganHang{
    private double soDu;

    public ATM() {
        this.soDu=0;
    }

    public ATM(String soThe, String tenChuThe, String cCCD, String diaChi,double soDu) {
        super(soThe, tenChuThe, cCCD, diaChi);
        this.soDu = soDu;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public void showInfor() {
        System.out.println("Số thẻ:"+getSoThe()+"\t"+"Tên chủ thẻ:"+getTenChuThe()+"\t"+"CCCD:"+getcCCD()+"\tĐịa chỉ:"+getDiaChi()+
                "\tSố dư:"+getSoDu());
    }

    @Override
    public String toString() {
        return super.toString()+","+getSoDu();
    }
}
