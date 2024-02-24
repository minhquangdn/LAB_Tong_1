
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
/**
 *
 * @author mb
 */
public class Booking implements Comparable<Booking>{
    private String bookingId;
    private Date bookingDate;
    private Date start;
    private Date finish;
    private String cusId;
    public static Map<Facility, Integer> bill;

    public Booking(String bookingId, Date bookingDate, Date start, Date finish, String cusId, Map<Facility, Integer> bill) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.start = start;
        this.finish = finish;
        this.cusId = cusId;
        this.bill = bill;
    }
 
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public static Map<Facility, Integer> getBill() {
        return bill;
    }

    public static void setBill(Map<Facility, Integer> bill) {
        Booking.bill = bill;
    }

   

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "bookingId=" + bookingId + ", bookingDate=" + dateFormat.format(bookingDate) + ", start=" + dateFormat.format(start) + ", finish=" + dateFormat.format(finish)+ ", cusId=" + cusId + ", bill=" + bill ;
    }

    @Override
    public int compareTo(Booking o) {
        if(this.getStart().before(o.getStart())) return -1;
        else if(o.getStart().before(this.getStart())) return 1;
        else {
            if(this.getFinish().before(o.getFinish())) return -1;
            else if(o.getFinish().before(this.getFinish())) return 1;
            else return 0;
        }
        }
    
    
    
}
