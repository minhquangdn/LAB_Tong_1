package controller;

import view.Menu;

public class FuramaController extends Menu {

    // CustomerManagement customerManagement = new CustomerManagement();
    // EmployeeManagement employeeManagement = new EmployeeManagement();
    // FacilityManagement facilityManagement = new FacilityManagement();
    // BookingManagement bookingManagement = new BookingManagement();
    // PromotionManagement promotionManagement = new PromotionManagement();

    public FuramaController() {
    }

    public FuramaController(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {          
                try {
                    String[] mchon = {"Display list employees",
                                      "Add new employee",
                                      "Edit employee",
                                      "Return main menu"};
                   EmployeeManagement employeeManagement = new EmployeeManagement("---------- MENU ----------",mchon);
                   employeeManagement.run();
                   break;
                } catch (Exception e) {
                }
            }

            case 2: {
                try {
                    String[] mchon = {"Display list customers",
                                      "Add new customer",
                                      "Edit customer",
                                      "Return main menu"};
                    CustomerManagement customerManagement = new CustomerManagement("---------- MENU ----------",mchon);
                    customerManagement.run();
                    break;
                } catch (Exception e) {
                }
            }

            case 3: {
                try {
                    String[] mchon = {"Display list facility",
                                      "Add new facility",
                                      "Display list facility maintenance",
                                      "Return main menu"};
                    FacilityManagement facilityManagement = new FacilityManagement("---------- MENU ----------",mchon);
                    // facilityManagement.setParentMenu(this);
                    facilityManagement.run();
                } catch (Exception e) {
                }
                break;
            }

            case 4: {
                try {
                    String[] mchon = {"Add new booking",
                                      "Display list booking",
                                      "Create new contracts",
                                      "Display list contracts",
                                      "Edit contracts",
                                      "Return main menu"};
                    BookingManagement bookingManagement = new BookingManagement("---------- MENU ----------",mchon);
                    bookingManagement.run();
                    break;
                } catch (Exception e) {
                }
            }

            case 5: {
                try {
                    String[] mchon = {"Display list customers use service",
                                      "Display list customers get voucher",
                                      "Return main menu"};
                    PromotionManagement promotionManagement = new PromotionManagement("---------- MENU ----------",mchon);
                    promotionManagement.run();
                    break;
                } catch (Exception e) {
                }
            }

            case 6: {
                System.out.println("Good bye, see you again!");
                System.exit(0);
            }
        }
    }

}
