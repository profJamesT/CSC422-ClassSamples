/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csp.week3codesamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jamestucker
 */
public class VactionPlanning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
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
        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("James.ser", false))) {
            oout.writeObject(tripList);
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException: " + ex);
        } catch (IOException ex) {
            System.out.println("IOExcption: " + ex);
        }
  
        //init the tripList before loading to make sure its actually loading
        tripList = null;
        
        //load the trips
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("James.ser"))) {
          tripList = (ArrayList<Trip>)oin.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException: " + ex);
        } catch (IOException ex) {
            System.out.println("IOExcption: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex);
        }
        
        for (Trip t : tripList) {
            System.out.println(t.getTripName() + " - " + t.getLocations().size());
        }
        
    }   
    
}
