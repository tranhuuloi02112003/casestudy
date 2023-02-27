package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    LinkedHashMap<String, Integer>  serviceLinkedHashMap= new LinkedHashMap<>();
    List<Facility> facilityList= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void displayFacilityManagement(){
        System.out.println(serviceLinkedHashMap.entrySet());
    }
    public void addNewVilla(){
        int chooseFacilicy;
        do {
            System.out.println("Menu add Facility");
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            chooseFacilicy = Integer.parseInt(scanner.nextLine());
            switch (chooseFacilicy) {
                case 1:
                    Villa villa= new Villa();
                    villa.input();
                    facilityList.add(villa);
                    if (serviceLinkedHashMap.containsKey("villa")){
                       int value= serviceLinkedHashMap.get("villa")+1;
                       serviceLinkedHashMap.put("villa",value);
                    }else {
                        serviceLinkedHashMap.put("villa",1);
                    }
                        break;
                case 2:
                    House house= new House();
                    house.input();
                    facilityList.add(house);
                    if (serviceLinkedHashMap.containsKey("house")){
                        int value=serviceLinkedHashMap.get("house")+1;
                        serviceLinkedHashMap.put("house",value);
                    }else {
                        serviceLinkedHashMap.put("house",1);
                    }
                    break;
                case 3:
                    Room room= new Room();
                    room.input();
                    facilityList.add(room);
                    if (serviceLinkedHashMap.containsKey("room")){
                        int value=serviceLinkedHashMap.get("room")+1;
                        serviceLinkedHashMap.put("room",value);
                    }else {
                        serviceLinkedHashMap.put("room",1);
                    }
                    break;
            }

        }while (chooseFacilicy!=4);
    }

    public void displayListFacilityMaintenance(){
        int chosse;
        do {
            System.out.println("Menu Display List Facility Maintenance ");
            System.out.println("1.Display Villa");
            System.out.println("2.Display House");
            System.out.println("3.Display Room");
            System.out.println("4.Back to Menu");
            System.out.print("Chọn chức năng:");
            chosse=Integer.parseInt(scanner.nextLine());
            switch (chosse){
                case 1:
                    for (int i = 0; i < facilityList.size(); i++) {
                        if (facilityList.get(i) instanceof Villa){
                            System.out.println(facilityList.get(i).toString());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < facilityList.size(); i++) {
                        if (facilityList.get(i) instanceof House){
                            System.out.println(facilityList.get(i).toString());
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < facilityList.size(); i++) {
                        if (facilityList.get(i) instanceof Room){
                            System.out.println(facilityList.get(i).toString());
                        }
                    }
                    break;
            }
        }while (chosse!=4);
    }







}
