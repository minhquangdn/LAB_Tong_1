package view;

import java.io.IOException;
import java.text.ParseException;
import controller.FuramaController;



public class Test {
    public static void main(String[] args) throws ParseException, IOException {
        String[] mchon = {"Employee Management",
                          "Customer Management",
                          "Facility Management",
                          "Booking Management",
                          "Promotion Management",
                          "Exit"};
        FuramaController furamaController = new FuramaController("-------------------- MAIN MENU --------------------",mchon);
        furamaController.run();
    }
}
