package quan_ly_the_ngan_hang;

public class CreditCard extends TheNganHang{
    private double duNo;
    private double hanMuc;

    public CreditCard() {
        this.duNo=0;
    }

    public CreditCard(String soThe, String tenChuThe, String cCCD, String diaChi, double hanMuc,double duNo) {
        super(soThe, tenChuThe, cCCD, diaChi);
        this.duNo = 0;
        this.hanMuc = hanMuc;
    }

    public double getDuNo() {
        return duNo;
    }

    public void setDuNo(double duNo) {
        this.duNo = duNo;
    }

    public double getHanMuc() {
        return hanMuc;
    }

    public void setHanMuc(double hanMuc) {
        this.hanMuc = hanMuc;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập hạng mức:");
        this.hanMuc=Double.parseDouble(scanner.nextLine());
        while((this.hanMuc)<=0){
            System.out.print("Nhập lại hạng mức >0:");
            this.hanMuc=Double.parseDouble(scanner.nextLine());
        }
    }

    @Override
    public void showInfor() {
        System.out.println("Số thẻ:"+getSoThe()+"\t"+"Tên chủ thẻ:"+getTenChuThe()+"\t"+"CCCD:"+getcCCD()+"\tĐịa chỉ:"+getDiaChi()+
                "\tDư nợ:"+getDuNo()+"\tHạn mức:"+getHanMuc());
    }

    @Override
    public String toString() {
        return super.toString()+","+getDuNo()+","+getHanMuc();
    }

}
