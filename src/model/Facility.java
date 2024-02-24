/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mb
 */
public abstract class Facility {

    private String id;
    private String name;
    private int square;
    private long price;
    private int numOfPer;
    private String type;

    public Facility(String id, String name, int square, long price, int numOfPer, String type) {
        this.id = id;
        this.name = name;
        this.square = square;
        this.price = price;
        this.numOfPer = numOfPer;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getNumOfPer() {
        return numOfPer;
    }

    public void setNumOfPer(int numOfPer) {
        this.numOfPer = numOfPer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
