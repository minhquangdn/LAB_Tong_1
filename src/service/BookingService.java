package service;

import model.Facility;
import model.Room;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import model.Booking;

public class BookingService {

    TreeSet<Booking> listBooking = new TreeSet<>();
    Queue<Booking> bookingBill = new LinkedList<>();
    ArrayList<String> listConstract = new ArrayList<>();
    Map<Facility, Integer> bill;
    Map<Booking, Integer> oorder = new HashMap<>();  //luu cac phong tromg 1 don
    Scanner in = new Scanner(System.in);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public BookingService() {
    }

    public void readInf() throws ParseException {
        Room r = new Room("Room", "RO001", "room", 0, 0, 0, "Luxury");
        bill.put(r, 2);
        listBooking.add(new Booking("0001", checkdate("20/2/2024"), checkdate("21/2/2024"), checkdate("25/2/2024"), "KH0001", bill));
        listBooking.add(new Booking("0002", checkdate("19/2/2024"), checkdate("23/2/2024"), checkdate("27/2/2024"), "KH0002", bill));
        listBooking.add(new Booking("0003", checkdate("21/2/2024"), checkdate("23/2/2024"), checkdate("25/2/2024"), "KH0003", bill));
        listBooking.add(new Booking("0004", checkdate("20/2/2024"), checkdate("26/2/2024"), checkdate("28/2/2024"), "KH0004", bill));
        listBooking.add(new Booking("0005", checkdate("20/2/2024"), checkdate("24/2/2024"), checkdate("27/2/2024"), "KH0005", bill));
    }

    public void addBooking() throws ParseException {
        String bookingId, customerId, serviceId;
        Date checkinDate, checkoutDate, now;
        Facility f;
        bill.clear();
        // ID
        do {
            bookingId = createBooingId();
        } while (!checkExistBookingId(bookingId));

        //Curent date
        do {

            now = new Date();
            System.out.println(now);
            //check in-out
            do {
                System.out.println("Input Checkin Date: ");
                checkinDate = getDateFromInput();
                if (now.after(checkinDate)) {
                    System.out.println("Please input checkin date after today!");
                }
            } while (checkinDate.before(now));

            do {
                System.out.println("Input Checkout Date: ");
                checkoutDate = getDateFromInput();
                if (checkoutDate.before(checkinDate)) {
                    System.out.println("Please input checkout date after checkin");
                }
            } while (checkoutDate.before(checkinDate));
            //------display customer id ......
            System.out.println("Input customer Id: ");
            customerId = in.nextLine();
            //------display facility id......
            System.out.println("Input service Id: ");

            serviceId = in.nextLine();
            f = FacilityService.search(serviceId); // return room or vila or house
            
            System.out.println("Input quantity: "); // check quan ddur k
            int quan = in.nextInt();
            
            bill.put(f, quan);

        } while (!confirm("continute booking"));
        Booking b = new Booking(bookingId, now, checkinDate, checkoutDate, customerId, bill);
        listBooking.add(b);
        System.out.println("Booking complete successful!");
        System.out.println("Your Booking ID is: " + bookingId);
        //------display room inf
    }
//------------------------------------------------------------------------------   

//------------------------------------------------------------------------------   
    public void displayListBooking() {
        System.out.println("Booking List: ");
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "Booking ID", "Booking Date", "Check-in Date", "Check-out Date", "Customer ID", "Service ID");
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
//         System.out.println(listBooking);  
        for (Booking b : listBooking) {
            System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", b.getBookingId(), dateFormat.format(b.getBookingDate()), dateFormat.format(b.getStart()), dateFormat.format(b.getFinish()), b.getCusId(), b.getBill().get(b));
            System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
        }

    }
//------------------------------------------------------------------------------ 

    public void addConstract() {
        String constractId, bookingId, deposit, total;
        do {
            System.out.println("Input Booking Id :");
            bookingId = in.nextLine();
        } while (!checkExistBookingId(bookingId));

        System.out.println("Your deposit amount is: ");

    }

//------------------------------------------------------------------------------ 
    public String createBooingId() {
        int max = 0;
        for (Booking b : listBooking) {
            if (Integer.parseInt(b.getBookingId()) > max) {
                max = Integer.parseInt(b.getBookingId());
            }
        }
        return String.valueOf(max + 1);
    }
//------------------------------------------------------------------------------  

    public Boolean checkExistBookingId(String id) {
        for (Booking b : listBooking) {
            if (b.getBookingId().equals(id)) {
                return false;
            }
        }
        return true;
    }
//------------------------------------------------------------------------------    
// check in here

    public Date getDateFromInput() throws ParseException {
        while (true) {
            String dateString = in.nextLine();
            if (!dateString.isEmpty()) {
                try {
                    Date date = dateFormat.parse(dateString);
                    return date;
                } catch (ParseException e) {
                    System.out.print("Invalid date format. Please enter again (dd/MM/yyyy):");
                }
            } else {
                System.out.print("Date cannot be empty. Please enter again (dd/MM/yyyy):");
            }
        }
    }

    public Date checkdate(String dateString) throws ParseException {
        while (true) {

            if (!dateString.isEmpty()) {
                try {
                    Date date = dateFormat.parse(dateString);
                    return date;
                } catch (ParseException e) {
                    System.out.print("Invalid date format. Please enter again (dd/MM/yyyy):");
                }
            } else {
                System.out.print("Date cannot be empty. Please enter again (dd/MM/yyyy):");
            }
        }
    }

    public static Boolean confirm(String msg) {
        System.out.println("Do you want to " + msg + " Y/N ?");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
