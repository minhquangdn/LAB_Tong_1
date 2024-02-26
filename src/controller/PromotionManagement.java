package controller;

import view.Menu;


public class PromotionManagement extends Menu {
    BookingService b = new BookingService();
    FacilityService fc = new FacilityService();
    PromotionRepository pr = new PromotionRepository();
    
    public PromotionManagement() {
    }

    public PromotionManagement(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
        switch (n){
            case 1 ->{ //"Display list customers use service"
                pr.showCusService();
            }
            
            case 2 ->{ //"Display list customers get voucher"
                pm.giveVoucher();
            }
            
            case 3 ->{ // "Return main menu"
                
            }         
        }
    }
}
