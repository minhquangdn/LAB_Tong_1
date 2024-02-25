/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;

import service.CustomerService;
import view.Menu;

/**
 *
 * @author DELL
 */
public class CustomerManagement extends Menu {

    CustomerService customerService = new CustomerService();
    FuramaController parentMenu; // Thêm thuộc tính để lưu trữ menu cha

    public CustomerManagement() {
    }

    public CustomerManagement(String td, String[] mc) {
        super(td, mc);
    }

    public void setParentMenu(FuramaController parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public void execute(int n) throws ParseException {
        switch (n){
            case 1 ->{ //"Display list customers"
                customerService.displayList();
            }
            
            case 2 ->{ //"Add new customer"
                customerService.addCus();
            }
            
            case 3 ->{ // "Edit customer"
                customerService.editCus();
            }
            
            case 4 ->{ // "Return main menu"
                System.out.println("Return main menu..");
                parentMenu.run(); // Gọi phương thức run() của menu cha (FuramaController)
            }
        }
    }
    
    
}
