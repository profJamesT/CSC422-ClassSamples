/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csp.classsampleweek1;

/**
 *
 * @author james
 */
public class Math {
    
    //Square a parameter
    public int squareIt(int x) {
        return x * x;
    }
    
    //Is the parameter even
    public boolean isEven(int x) {
        if (x%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    //sum the two parameters
    public int sumIt(int x, int y) {
        return x * y;
    }
    
     
}
