package services;

import models.Employee;
import type.TrinhDo;
import type.ViTri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    LinkedList<Employee> linEmployees = new LinkedList<>();
    Scanner scanner= new Scanner(System.in);
    public void addNew(){
        Employee employee= new Employee();
        System.out.print("Nhập họ tên: ");
        employee.setHoTen(scanner.nextLine());
        System.out.print("Nhập giới tính:");
        employee.setGioiTinh(scanner.nextLine());
        System.out.print("Nhập số CMND:");
        employee.setSoCMND(scanner.nextLine());
        System.out.print("Nhập SDT:");
        employee.setSoDienThoai(scanner.nextLine());
        System.out.print("Nhập Email:");
        employee.setEmail(scanner.nextLine());
        System.out.print("Nhập mã nhân viên:");
        employee.setMaNhanVien(scanner.nextLine());
        System.out.print("Nhập trình độ:");
        employee.setTrinhDo(TrinhDo.giaTriTrinhDo());
        System.out.print("Nhập lương:");
        employee.setLuong(scanner.nextDouble());
        System.out.print("Nhập vị trí:");
        employee.setViTri(ViTri.giaTriViTri());
        linEmployees.add(employee);
    }
    public void display(){
        for(Employee e: linEmployees){
            System.out.println("Họ tên:"+e.getHoTen()+"\tGiới tính:"+e.getGioiTinh()+"\tCMND:"+e.getSoCMND()+"\tSDT:"+e.getSoDienThoai()
                    +"\tEmail:"+e.getEmail()+"\tMã nhân viên:"+e.getMaNhanVien()+"\t Trình độ:"+e.getTrinhDo()+"\t Lương:"+e.getLuong()+"\t Vị trí:"+e.getViTri());
        }
    }
    public void edit(){
        System.out.print("Nhập mã nhân viên muốn sửa:");
        String id=scanner.nextLine();
        for(Employee e:linEmployees){
            if (e.getMaNhanVien().equalsIgnoreCase(id)){

                while (true){
                    System.out.println("1.Họ tên\t2.Giới tính\t3.CMND\t4.SDT\t5.Email\t6.Mã nhân viên\t7.Trình độ\t8.Lương\t9.Vị trí");
                    System.out.println("10.exit");
                    System.out.print("Nhập thông tin muốn thay đổi: ");
                    int select= scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Nhập họ tên mới:");
                            String nameNew=scanner.nextLine();
                            e.setHoTen(nameNew);
                            break;
                        case 2:
                            System.out.print("Nhập giới tính mới:");
                            String gioiTinhNew=scanner.nextLine();
                            e.setGioiTinh(gioiTinhNew);
                            break;
                        case 3:
                            System.out.print("Nhập CMND mới:");
                            String cMNDNew=scanner.nextLine();
                            e.setSoCMND(cMNDNew);
                            break;
                        case 4:
                            System.out.print("Nhập SDT mới:");
                            String sDTNew=scanner.nextLine();
                            e.setSoDienThoai(sDTNew);
                            break;
                        //5.Email	6.Mã nhân viên	7.Trình độ	8.Lương	9.Vị trí
                        case 5:
                            System.out.print("Nhập email mới:");
                            String emailNew=scanner.nextLine();
                            e.setEmail(emailNew);
                            break;
                        case 6:
                            System.out.print("Nhập mã nhân viên mới:");
                            String maNhanVienNew=scanner.nextLine();
                            e.setMaNhanVien(maNhanVienNew);
                            break;
                        case 7:
                            System.out.print("Nhập trình độ mới:");
                            TrinhDo trinhDoNew=TrinhDo.giaTriTrinhDo();
                            e.setTrinhDo(trinhDoNew);
                            break;
                        case 8:
                            System.out.print("Nhập Lương mới:");
                            double luongNew=scanner.nextDouble();
                            e.setLuong(luongNew);
                            break;
                        case 9:
                            System.out.print("Nhập vị trí mới:");
                            ViTri viTriNew=ViTri.giaTriViTri();
                            e.setViTri(viTriNew);
                            break;
                        case 10:
                            return;
                    }
                }
            }
        }

    }

}
//1. Trong class CustomerServiceImpl sử dụng LinkedList, static property, static block để lưu trữ và khởi tạo dữ liệu.
// Viết các chức năng xử lý business cho phần hiển thị danh sách khách hàng, thêm mới khách hàng, chỉnh sửa thông tin cho khách hàng.
//2. Tạo đối tượng CustomerServiceImpl trong FuramaController
//3.  Sử dụng các method business đã viết trong CustomerServiceImpl để hoàn thành chức năng Customer Management