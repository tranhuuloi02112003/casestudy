package controllers;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
    CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
    FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();

    public void displayMainMenu() {
        int select = 0;
        do {
            System.out.println("Menu\n1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.print("Chọn chức năng:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    chucNang1();
                    break;
                case 2:
                    chucNang2();
                    break;
                case 3:
                    chucNang3();
                    break;
                case 4:
                    System.out.println("===========");
                    System.out.println("Menu Booking Management ");
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu");
                    break;
                case 5:
                    System.out.println("===========");
                    System.out.println("Promotion Management ");
                    System.out.println("1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu");
                    break;
            }
        } while (select != 6);
    }

    private void chucNang3() {
        int choose3;
        do {
            System.out.println("===========");
            System.out.println("Menu Facility Management ");
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    //Hiển thị danh sách bảo trì cơ sở
                    "4.Return main menu");
             choose3 = Integer.parseInt(scanner.nextLine());
            switch (choose3) {
                case 1:
                    facilityServiceImpl.displayFacilityManagement();
                    break;
                case 2:
                    facilityServiceImpl.addNewVilla();
                    break;
                case 3:
                    facilityServiceImpl.displayListFacilityMaintenance();
                    break;

            }
        }while (choose3!=4);
    }

    private void chucNang1() {
        int chooseEmployeeManagement;
        do {
            System.out.println("===========");
            System.out.println("Menu Employee Management");
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu");
            System.out.print("Chọn chức năng:");
            chooseEmployeeManagement = Integer.parseInt(scanner.nextLine());
            switch (chooseEmployeeManagement) {
                case 1:
                    employeeServiceImpl.display();
                    break;
                case 2:
                    employeeServiceImpl.addNew();
                    break;
                case 3:
                    employeeServiceImpl.edit();
                    break;
            }
        } while (chooseEmployeeManagement != 4);
    }

    private void chucNang2() {
        int chooseCustomerManagement;
        do {
            System.out.println("===========");
            System.out.println("Menu Customer Management");
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu");
            System.out.print("Chọn chức năng:");
            chooseCustomerManagement = Integer.parseInt(scanner.nextLine());
            switch (chooseCustomerManagement) {
                case 1:
                    customerServiceImpl.display();
                    break;
                case 2:
                    customerServiceImpl.addNew();
                    break;
                case 3:
                    customerServiceImpl.edit();
                    break;
            }
        } while (chooseCustomerManagement != 4);
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();


    }

}
