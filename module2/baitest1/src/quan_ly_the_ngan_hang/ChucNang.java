package quan_ly_the_ngan_hang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNang {
    Scanner scanner = new Scanner(System.in);
    List<TheNganHang> list = new ArrayList<>();


    public void dangKiThe() {
        while (true) {
            System.out.println("1.ATM" + "\t2.CreditCard" + "\t3.Quay lại");
            System.out.print("Chọn thẻ muốn đăng ký:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ATM atm = new ATM();
                    atm.input();
                    list.add(atm);
                    break;
                case 2:
                    CreditCard creditCard = new CreditCard();
                    creditCard.input();
                    list.add(creditCard);
                    break;
                case 3:
                    return;
            }
        }
    }
    public void ghiFile(String path) {
        try {
            FileWriter pw = new FileWriter(path);
            for (TheNganHang tmp : list) {
                pw.write(tmp.toString());
                pw.write("\r\n");
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TheNganHang> docFile(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(line)) {
                    continue;
                }
                String[] str = line.split(",");
                if (str.length == 5) {
                    ATM atm = new ATM(str[0], str[1], str[2], str[3], Double.parseDouble(str[4]));
                    list.add(atm);
                } else {
                    CreditCard creditCard = new CreditCard(str[0], str[1], str[2], str[3], Double.parseDouble(str[4]), Double.parseDouble(str[5]));
                    list.add(creditCard);
                }
                reader.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void thanhToanBangThe() {
        System.out.print("Nhập số thẻ để sử dụng:");
        Double soTienCanThanhToan;
        String soThe = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (soThe.equals(list.get(i).soThe)) {
                System.out.print("Nhập số tiền cần thanh toán:");
                soTienCanThanhToan = Double.parseDouble(scanner.nextLine());
                if (list.get(i) instanceof CreditCard) {
                    if ((((CreditCard) list.get(i)).getDuNo() + soTienCanThanhToan) <= ((CreditCard) list.get(i)).getHanMuc()) {
                        ((CreditCard) list.get(i)).setDuNo(((CreditCard) list.get(i)).getDuNo() + soTienCanThanhToan);
                        System.out.println("Thanh toán thành công");
                    } else {
                        System.out.println("Thanh toán k thành công vì lý do là hạn mức không đủ để thanh toán ");
                    }
                }
                if (list.get(i) instanceof ATM) {
                    if ((((ATM) list.get(i)).getSoDu() - soTienCanThanhToan) >= 0) {
                        ((ATM) list.get(i)).setSoDu(((ATM) list.get(i)).getSoDu() - soTienCanThanhToan);
                        System.out.println("Thanh toán thành công");
                    } else {
                        System.out.println("Thanh toán k thành công vì lý do là số tiền không đủ để thanh toán ");
                    }
                }
            }
        }
    }

    public void nopTien() {
        System.out.print("Nhập số thẻ muốn nạp:");
        String soTheMuonNap = scanner.nextLine();
        System.out.print("Nhập số tiền muốn nạp:");
        double soTienMuonNap = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSoThe().equals(soTheMuonNap)) {
                if (list.get(i) instanceof ATM) {
                    ((ATM) list.get(i)).setSoDu(((ATM) list.get(i)).getSoDu() + soTienMuonNap);
                    System.out.println("Nộp thành công");
                }
                if (list.get(i) instanceof CreditCard) {
                    ((CreditCard) list.get(i)).setDuNo(((CreditCard) list.get(i)).getDuNo() - soTienMuonNap);
                    System.out.println("Nộp thành công");
                }
            }
        }
    }

    public void timCard() {
//        List<TheNganHang> dsMoi= new ArrayList<>();
        System.out.print("Nhập CMND muốn tìm:");
        String cMNDMuonTim = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getcCCD().equals(cMNDMuonTim)) {
                list.get(i).showInfor();
            }
        }
    }

    public void chuyenKhoan() {
//        list=docFile(Menu.PATH);
        System.out.print("Nhập số thẻ chuyển:");
        String soTheChuyen = scanner.nextLine();
        System.out.print("Nhập số thẻ nhận:");
        String soTheNhan = scanner.nextLine();
        boolean tonTaiTheChuyen = false;
        boolean tonTaiTheNhan = false;
        boolean soTienKhongDu = false;
        int viTriTheNhan = 0;
        System.out.print("Số tiền muốn chuyển:");
        double soTienChuyen = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getSoThe().equals(soTheNhan)) {
                tonTaiTheNhan = true;
                viTriTheNhan = i;
            }
            if (list.get(i).getSoThe().equals(soTheChuyen) && (list.get(i) instanceof ATM) && (((ATM) list.get(i)).getSoDu()>= soTienChuyen)) {
                tonTaiTheChuyen = true;
            }
        }

        if (tonTaiTheChuyen && tonTaiTheNhan) {
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).getSoThe().equals(soTheChuyen)) && list.get(i) instanceof ATM) {
                    if (((ATM) list.get(i)).getSoDu() >= soTienChuyen) {
                        ((ATM) list.get(i)).setSoDu(((ATM) list.get(i)).getSoDu() - soTienChuyen);

                        if (list.get(viTriTheNhan) instanceof CreditCard) {
                            ((CreditCard) list.get(viTriTheNhan)).setDuNo(((CreditCard) list.get(viTriTheNhan)).getDuNo() - soTienChuyen);
                        }
                        if (list.get(viTriTheNhan) instanceof ATM) {
                            ((ATM) list.get(viTriTheNhan)).setSoDu(((ATM) list.get(viTriTheNhan)).getSoDu() + soTienChuyen);
                        }
                    }
                }
            }

        } else {
            System.out.println("Xem lại số thẻ hoặc thẻ chuyển phải là ATM hoặc số dư không đủ");
        }
    }

    public void huyThe() {
        System.out.print("Nhập số thẻ cần hủy:");
        String soTheCanHuy = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSoThe().equals(soTheCanHuy)) {
                if (list.get(i) instanceof CreditCard) {
                    if (((CreditCard) list.get(i)).getDuNo() <= 0) {
                        list.remove(i);
                    } else {
                        System.out.println("Không thể hủy thẻ vì chưa thanh toán xong");
                    }
                } else {
                    list.remove(i);
                }

            }
        }


    }
}