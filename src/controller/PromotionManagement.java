package controller;

import service.BookingService;
import service.FacilityService;
import repository.PromotionRepository;
import view.Menu;


public class PromotionManagement extends Menu {
    BookingService b = new BookingService();
    FacilityService fc = new FacilityService();
    PromotionRepository pr = new PromotionRepository();
    FuramaController parentMenu; // Thêm thuộc tính để lưu trữ menu cha
    
    public PromotionManagement() {
    }

    public PromotionManagement(String td, String[] mc) {
        super(td, mc);
    }
    
    public void setParentMenu(FuramaController parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public void execute(int n) throws ParseException, IOException {
        switch (n){
            case 1 ->{ //"Display list customers use service"
                pr.showCusService();
            }
            
            case 2 ->{ //"Display list customers get voucher"
                pr.giveVoucher();
            }
            
            case 3 ->{ // "Return main menu"
                System.out.println("Return main menu..");
                parentMenu.run(); // Gọi phương thức run() của menu cha (FuramaController)
            
            }         
        }
    }
}
