
package controller;

import service.EmployeeService;
import view.Menu;

/**
 *
 * @author DELL
 */
public class EmployeeManagement extends Menu {

    EmployeeService employeeService = new EmployeeService();

    public EmployeeManagement() {
    }

    public EmployeeManagement(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
        switch (n){
            case 1 ->{ //"Display list employees"
                employeeService.displayList();
  
            }
            
            case 2 ->{ //"Add new employee"
                employeeService.addEmp();

            }
            
            case 3 ->{ // "Edit employee"
                employeeService.editEmp();
   
            }
            
            case 4 ->{ // "Return main menu"
                System.out.println("Return main menu..");
             
            }
        }
    }
    
}
