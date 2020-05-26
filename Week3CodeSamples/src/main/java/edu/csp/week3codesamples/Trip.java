/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csp.week3codesamples;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jamestucker
 */
public class Trip implements Serializable {
    private String tripName;
    private String startDate;
    private String endDate;
    ArrayList<String> locations;
    
    public Trip(String tripName) {
        this.tripName = tripName; 
        locations = new ArrayList<String>();
    }
    
    public void addLocation(String location) {
        locations.add(location);
    }
    
}
