
package model;

/**
 *
 * @author mb
 */
public class Room extends Facility{
    
    private String service;

    public Room(String service, String id, String name, int square, long price, int numOfPer, String type) {
        super(id, name, square, price, numOfPer, type);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    
    
}
