/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csp.classsampleweek1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author james
 */
public class MathTest {
    
    public MathTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    //just comment these out
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }

    /**
     * Test of squareIt method, of class Math.
     */
    @org.junit.jupiter.api.Test
    public void testSquareIt() {
        System.out.println("squareIt");
        int x = 2;
        Math instance = new Math();
        int expResult = 4;
        int result = instance.squareIt(x);
        assertEquals(expResult, result);
        
        assertEquals(64, instance.squareIt(8));
        assertEquals(4080400, instance.squareIt(2020));
    }

    /**
     * Test of isEven method, of class Math.
     */
    @org.junit.jupiter.api.Test
    public void testIsEven() {
        System.out.println("isEven");
        int x = 3;
        Math instance = new Math();
        boolean expResult = false;
        boolean result = instance.isEven(x);
        assertEquals(expResult, result);
        //simplify when possible
        assertEquals(true, instance.isEven(2));
    }

    /**
     * Test of sumIt method, of class Math.
     */
    @org.junit.jupiter.api.Test
    public void testSumIt() {
        System.out.println("sumIt");
        int x = 2;
        int y = 2;
        Math instance = new Math();
        int expResult = 0;
        int result = instance.sumIt(x, y);
//        assertEquals(5, instance.sumIt(1, 4));
//        assertEquals(2020, instance.sumIt(2000, 20));
//        assertEquals(84, instance.sumIt(42, 42));
//        assertEquals(-1, instance.sumIt(0, -1));

    }
    
}
