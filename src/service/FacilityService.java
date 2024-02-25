package service;

import java.util.ArrayList;
import java.util.List;
import model.Facility;
import model.House;
import model.Room;
import model.Villa;

/**
 *
 * @author Quang
 */
public class FacilityService {
    
    static List<Facility> listFacility = new ArrayList<>();

    public FacilityService() {
        addCung();
    }

    public static List<Facility> getListFacility() {
        return listFacility;
    }

    public static void setListFacility(List<Facility> listFacility) {
        FacilityService.listFacility = listFacility;
    }

    public Facility searchFacility(String id){
        for (Facility f : listFacility){
            if (f.getId().equals(id))
                return f;
        }
        return null;
    }
    

    
    public void displayFacility(){
            
        System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                                 List of Villa                                                                |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s | %-12s | %-12s |", "Service code", "Service name", "Square", "Price", "Number of person", "Type", "Room type", "Pool Square", "Floor"));
        System.out.println("|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|--------------|--------------|");
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------|");

        for (Facility facility : listFacility) {
            if(facility.getId().contains("VL")){
                Facility nf = (Villa)facility;
                System.out.println(nf.toString());
            } 
        }
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------|");

        
        System.out.println("\n\n+----------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                  List of House                                                 |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |", "Service code", "Service name", "Square", "Price", "Number of person", "Type", "Service"));
        System.out.println("|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|");
        System.out.println("|----------------------------------------------------------------------------------------------------------------|");

        for (Facility facility : listFacility) {
            if(facility.getId().contains("HO")){
                Facility nf = (House)facility;
                System.out.println(nf.toString());
            }
        }
        System.out.println("|----------------------------------------------------------------------------------------------------------------|");

        
        System.out.println("\n\n+----------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                   List of Room                                                 |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |", "Service code", "Service name", "Square", "Price", "Number of person", "Type","Service"));
        System.out.println("|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|");
        System.out.println("+----------------------------------------------------------------------------------------------------------------+");

        for (Facility facility : listFacility) {
            if(facility.getId().contains("RO")){
                Facility nf = (Room)facility;
                System.out.println(nf.toString());
            }
        }
        System.out.println("|----------------------------------------------------------------------------------------------------------------|");

        
    };
    
    public static void addCung() {
        if (listFacility.isEmpty()) {
            listFacility.add(new Villa("SVVL-0001","Villa 1",600, 2000, 10, "Villa", "luxury", "80", "4"));
            listFacility.add(new Villa("SVVL-0002","Villa 2",400, 400, 10, "Villa", "Standard", "60", "3"));
            listFacility.add(new Villa("SVVL-0003","Villa 3",250, 200, 8, "Villa", "Standard", "50", "3"));

            listFacility.add(new House("SVHO-0001", "House 1", 200, 200, 6, "House" , "luxury", "2"));
            listFacility.add(new House("SVHO-0002", "House 2", 100, 100, 4, "House" , "luxury", "1"));
            listFacility.add(new House("SVHO-0003", "House 3", 80, 50, 4, "House" , "Standard", "1"));

            listFacility.add(new Room("SVRO-0001", "Room 1", 50, 100, 4, "Room", "Buffet"));
            listFacility.add(new Room("SVRO-0002", "Room 2", 40, 100, 4, "Room", "Wifi"));
            listFacility.add(new Room("SVRO-0003", "Room 3", 40, 100, 4, "Room", "Girl"));

        }
    }

    
    
    public void addNewFacility(){
        
    };
    
    public void displayFacilityMaintainence(){
        
    };
}
