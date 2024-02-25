package controller;

import service.FacilityService;
import view.Menu;

/**
 *
 * @author DELL
 */
public class FacilityManagement extends Menu {

    FacilityService facilityService = new FacilityService();

    public FacilityManagement() {
    }

    public FacilityManagement(String td, String[] mc) {
        super(td, mc);
    }                            

    @Override
    public void execute(int n) {
        switch (n){
            case 1 ->{ //"Display list facility"
                facilityService.displayFacility();
            }
            
            case 2 ->{ //"Add new facility"
                facilityService.addNewFacility();
            }
            
            case 3 ->{ //"Display list facility maintenance"
                facilityService.displayFacilityMaintainence();
            }
            
            case 4 ->{ // "Return main menu"
                System.out.println("Return main menu..");
            }
        }
    }
    
}
