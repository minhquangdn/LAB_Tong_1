package view;

import java.text.ParseException;

import controller.BookingManagement;
import controller.FuramaController;
import model.Booking;
import service.BookingService;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
//        String[] mchon = {"Display list facility",
//                          "Add new facility",
//                          "Edit facility maintenance",
//                          "Return main menu"};
//        FacilityService facilityManagement = new FacilityService("---------- MENU ----------",mchon);
//        facilityManagement.run();

        String[] mchon = {"Employee Management",
                          "Customer Management",
                          "Facility Management",
                          "Booking Management",
                          "Promotion Management",
                          "Exit"};
        FuramaController furamaController = new FuramaController("---------- MENU ----------",mchon);
       
        furamaController.run();
    }
}
