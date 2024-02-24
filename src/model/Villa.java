/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mb
 */
public class Villa extends Facility {
    private String roomType;
    private String poolSquare;
    private String floor;

    public Villa(String roomType, String poolSquare, String floor, String id, String name, int square, long price, int numOfPer, String type) {
        super(id, name, square, price, numOfPer, type);
        this.roomType = roomType;
        this.poolSquare = poolSquare;
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPoolSquare() {
        return poolSquare;
    }

    public void setPoolSquare(String poolSquare) {
        this.poolSquare = poolSquare;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    
}
