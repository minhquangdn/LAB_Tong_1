package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Facility;
import model.House;
import model.Room;
import model.Villa;
import repository.FacilityRepository;
import utils.Validation;

/**
 *
 * @author Quang
 */
public class FacilityService {
    List<Facility> listFacility = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public FacilityService() {
        FacilityRepository.readFile(listFacility);
    }

    public List<Facility> getListFacility() {
        return listFacility;
    }

    public void setListFacility(List<Facility> listFacility) {
        this.listFacility = listFacility;
    }

    public Facility searchFacility(String id) {
        for (Facility f : listFacility) {
            if (f.getId().equals(id))
                return f;
        }
        return null;
    }

    public void displayFacility() {

        System.out.println(
                "+----------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println(
                "|                                                                 List of Villa                                                                |");
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s | %-12s | %-12s |",
                "Service code", "Service name", "Square", "Price", "Number of person", "Type", "Room type",
                "Pool Square", "Floor"));
        System.out.println(
                "|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|--------------|--------------|");
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------------------------------------|");

        for (Facility facility : listFacility) {
            if (facility.getId().contains("VL")) {
                Facility nf = (Villa) facility;
                System.out.println(nf.toString());
            }
        }
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------------------------------------|");

        System.out.println(
                "\n\n+----------------------------------------------------------------------------------------------------------------+");
        System.out.println(
                "|                                                  List of House                                                 |");
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |", "Service code",
                "Service name", "Square", "Price", "Number of person", "Type", "Service"));
        System.out.println(
                "|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|");
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------|");

        for (Facility facility : listFacility) {
            if (facility.getId().contains("HO")) {
                Facility nf = (House) facility;
                System.out.println(nf.toString());
            }
        }
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------|");

        System.out.println(
                "\n\n+----------------------------------------------------------------------------------------------------------------+");
        System.out.println(
                "|                                                   List of Room                                                 |");
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |", "Service code",
                "Service name", "Square", "Price", "Number of person", "Type", "Service"));
        System.out.println(
                "|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|");
        System.out.println(
                "+----------------------------------------------------------------------------------------------------------------+");

        for (Facility facility : listFacility) {
            if (facility.getId().contains("RO")) {
                Facility nf = (Room) facility;
                System.out.println(nf.toString());
            }
        }
        System.out.println(
                "|----------------------------------------------------------------------------------------------------------------|");

    };

    // void addCung() {
    //     if (listFacility.isEmpty()) {
    //         listFacility.add(new Villa("SVVL-0001", "Villa 1", 600, 2000, 10, "Villa", "luxury", "80", "4"));
    //         listFacility.add(new Villa("SVVL-0002", "Villa 2", 400, 400, 10, "Villa", "Standard", "60", "3"));
    //         listFacility.add(new Villa("SVVL-0003", "Villa 3", 250, 200, 8, "Villa", "Standard", "50", "3"));

    //         listFacility.add(new House("SVHO-0001", "House 1", 200, 200, 6, "House", "luxury", "2"));
    //         listFacility.add(new House("SVHO-0002", "House 2", 100, 100, 4, "House", "luxury", "1"));
    //         listFacility.add(new House("SVHO-0003", "House 3", 80, 50, 4, "House", "Standard", "1"));

    //         listFacility.add(new Room("SVRO-0001", "Room 1", 50, 100, 4, "Room", "Buffet"));
    //         listFacility.add(new Room("SVRO-0002", "Room 2", 40, 100, 4, "Room", "Wifi"));
    //         listFacility.add(new Room("SVRO-0003", "Room 3", 40, 100, 4, "Room", "Girl"));

    //     }
    // }

    public void addNewFacility() {
        List<Facility> fList = new ArrayList<>();
        int choice = 1;
        do {
            System.out.println("1. Add new villa"
                                +"\n2. Add new house"
                                +"\n3. Add new room"
                                +"\n4. Back to menu");
            choice = Validation.getIntFromInput("your choice");
            String svID = null;
            if(choice == 1){
                int dem = 0;
                for (Facility facility : listFacility) {
                    if (facility.getId().contains("VL")) {
                        dem++;
                    }
                }
                svID = "SVVL-" + String.format("%04d", ++dem);
            } else if (choice == 2){
                int dem = 0;
                for (Facility facility : listFacility) {
                    if (facility.getId().contains("HO")) {
                        dem++;
                    }
                }
                svID = "SVHO-" + String.format("%04d", ++dem);
            } else if (choice == 3){
                int dem = 0;
                for (Facility facility : listFacility) {
                    if (facility.getId().contains("RO")) {
                        dem++;
                    }
                }
                svID = "SVRO-" + String.format("%04d", ++dem);
            } else if (choice == 4) break;
            Facility nFacility = addFacility(svID);
            listFacility.add(nFacility);
            fList.add(nFacility);
        } while (choice <= 4);
        FacilityRepository.writeFile(fList);
        System.out.println("Add successfully!");
    }

    public void displayFacilityMaintainence() {
        FacilityRepository facilityRepository = new FacilityRepository();
        facilityRepository.addDataFromList(listFacility);
        facilityRepository.printFacilityMap();
    }

    ;

    Facility addFacility(String svID) {
        String name = Validation.getStringFromInput("service name");
        int square = Validation.getAreaOrPoolFromInput("the square of Area");
        System.out.println("Enter the service price");
        long price = sc.nextLong();
        int svPeople = Validation.getSvPeopleFromInput("the number of people");
        String type = Validation.getStringFromInput("service type");
        if (svID.contains("RO")) {
            String service = Validation.getStringFromInput("free service");
            return (new Room(svID, name, square, price, svPeople, type, service));
        } else if (svID.contains("HO")) {
            String houseType = Validation.getStringFromInput("the house type");
            String floor = Validation.getStringFromInput("the floor");
            return (new House(svID, name, square, price, svPeople, type, houseType, floor));
        } else {
            String roomType = Validation.getStringFromInput("villa type");
            int pool = Validation.getAreaOrPoolFromInput("pool square");
            String poolSquare = String.valueOf(pool);
            int f = Validation.getIntFromInput("the floor");
            String floor = String.valueOf(f);
            return (new Villa(svID, name, square, price, f, type, roomType, poolSquare, floor));
        }
    }

}
