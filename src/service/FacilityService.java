/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Facility;
import model.House;
import model.Room;
import model.Villa;

/**
 *
 * @author DELL
 */
public class FacilityService {

    static List<Facility> listFacility = new ArrayList<>();


    public void displayFacility();
    public void addNewFacility();
    public void editFacility();
}
