package model;

/**
 *
 * @author Quang
 */
public class Room extends Facility{
    
    private String service;

    public Room(String id, String name, int square, long price, int numOfPer, String type, String service) {
        super(id, name, square, price, numOfPer, type);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return (String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s |", getId(),getName(),getSquare()+"m2",getPrice()+"$",getNumOfPer(),getType(),getService()));
    }
    
    
    
}
