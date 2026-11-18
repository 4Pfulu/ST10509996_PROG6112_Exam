/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.matresssalesreport;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pfulu
 */
public class IProductTest {
    
    public IProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetTotalProductsSold method, of class IProduct.
     */
    @Test
    public void testGetTotalProductsSold() {
        System.out.println("GetTotalProductsSold");
        IProduct instance = new IProductImpl();
        int expResult = 0;
        int result = instance.GetTotalProductsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAverageProductSold method, of class IProduct.
     */
    @Test
    public void testGetAverageProductSold() {
        System.out.println("GetAverageProductSold");
        IProduct instance = new IProductImpl();
        double expResult = 0.0;
        double result = instance.GetAverageProductSold();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetMostPopularProduct method, of class IProduct.
     */
    @Test
    public void testGetMostPopularProduct() {
        System.out.println("GetMostPopularProduct");
        IProduct instance = new IProductImpl();
        String expResult = "";
        String result = instance.GetMostPopularProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IProductImpl implements IProduct {

        public int GetTotalProductsSold() {
            return 0;
        }

        public double GetAverageProductSold() {
            return 0.0;
        }

        public String GetMostPopularProduct() {
            return "";
        }
    }
    
}
