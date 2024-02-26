package controller;

import java.io.IOException;
import java.text.ParseException;

import service.EmployeeService;
import view.Menu;

public class EmployeeManagement extends Menu {

    EmployeeService employeeService = new EmployeeService();
    FuramaController parentMenu; // Thêm thuộc tính để lưu trữ menu cha

    public EmployeeManagement() {
    }

    public EmployeeManagement(String td, String[] mc) {
        super(td, mc);
    }
    
    public void setParentMenu(FuramaController parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public void execute(int n) throws ParseException, IOException {
        switch (n) {
            case 1: //"Load list employees"
                employeeService.getListFromFile();
                break;
            
            case 2: //"Display list employees"
                employeeService.displayList();
            break;

            case 3: //"Add new employee"
                employeeService.addEmp();
                break;
            
            case 4: //"Edit employee"
                employeeService.editEmp();
                break;
            
            case 5: //"Return main menu"
                System.out.println("Return main menu..");
                parentMenu.run(); // Gọi phương thức run() của menu cha (FuramaController)
                break;
        }
    }
    
    // ...
}