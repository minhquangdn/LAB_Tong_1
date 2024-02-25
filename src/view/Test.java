package view;

import controller.FuramaController;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
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
