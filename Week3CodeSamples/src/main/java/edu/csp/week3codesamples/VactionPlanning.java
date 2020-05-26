/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csp.week3codesamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jamestucker
 */
public class VactionPlanning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Trip> tripList = new ArrayList<Trip>();
        Trip tripOne = new Trip("Hawaii");
        Trip tripTwo = new Trip("Alaska");
        Trip tripThree = new Trip("TheOfficeLocations");
        tripThree.addLocation("Scranton");
        tripThree.addLocation("New York");
        
        tripList.add(tripOne);
        tripList.add(tripTwo);
        tripList.add(tripThree);
        
        //save the trips
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        try{
            fout = new FileOutputStream("James.ser", true);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(tripList);
        } catch (Exception ex) {
            System.out.println("Error when trying to write the file!");
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (Exception e) {
                    System.out.println("Error when trying to close the file!");
                }
            } 
        }
        
        tripList = null;
        
        //load the trips
        ObjectInputStream objectinputstream = null;
        try {
            FileInputStream streamIn = new FileInputStream("James.ser");
            objectinputstream = new ObjectInputStream(streamIn);
            tripList = (ArrayList<Trip>) objectinputstream.readObject();
            //tripList.add(readCase);
            //System.out.println(recordList.get(i));
        } catch (Exception e) {
            System.out.println("Error while loading: " + e);
        } finally {
            if(objectinputstream != null){
                try {
                objectinputstream .close();
                } catch (Exception e) {
                    System.out.println("Error closing file:" + e);
                }
            } 
        }
        
        for (Trip t : tripList) {
            System.out.println(t.getTripName() + " - " + t.getLocations().size());
        }
        
    }
    
}
