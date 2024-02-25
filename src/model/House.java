/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quang
 */
public class House extends Facility{
    
    private String houseType;
    private String floor;

    public House(String id, String name, int square, long price, int numOfPer, String type, String houseType, String floor) {
        super(id, name, square, price, numOfPer, type);
        this.houseType = houseType;
        this.floor = floor;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return (String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |", getId(),getName(),getSquare()+"m2",getPrice()+"$",getNumOfPer(),getType(),getHouseType(),getFloor()));
    }
    
    
}
