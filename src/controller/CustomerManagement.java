/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.CustomerService;
import view.Menu;

/**
 *
 * @author DELL
 */
public class CustomerManagement extends Menu {

    CustomerService customerService = new CustomerService();

    public CustomerManagement() {
    }

    public CustomerManagement(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
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
            }
        }
    }
    
    
}
