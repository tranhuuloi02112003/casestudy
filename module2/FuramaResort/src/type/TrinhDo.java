package type;

import java.util.Scanner;

public enum TrinhDo {
    trungCap,caoDang,daiHoc,sauDaiHoc;

    public static TrinhDo giaTriTrinhDo(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("1.Trung cấp\t2.Cao đẳng\t3.Đại học\t4.Sau đại học");
        System.out.print("Chọn giá trị Trình Độ:");
        int select=Integer.parseInt(scanner.nextLine());
        switch (select){
            case 1:
                return TrinhDo.trungCap;
            case 2:
                return TrinhDo.caoDang;
            case 3:
                return TrinhDo.daiHoc;
            case 4:
                return TrinhDo.sauDaiHoc;
        }
        return null;
    }
}
