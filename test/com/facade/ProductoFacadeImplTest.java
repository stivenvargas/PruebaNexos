/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facade;

import com.dto.ProductoDto;
import com.dto.ProductoDto1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stive
 */
public class ProductoFacadeImplTest {
    
    public ProductoFacadeImplTest() {
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
     * Test of listarProductoService method, of class ProductoFacadeImpl.
     */
    @Test
    public void testListarProductoService() {
        System.out.println("listarProductoService");
        ProductoFacadeImpl instance = new ProductoFacadeImpl();
        ProductoDto expResult = null;
        ProductoDto result = instance.listarProductoService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarProductoId method, of class ProductoFacadeImpl.
     */
    @Test
    public void testListarProductoId() {
        System.out.println("listarProductoId");
        int id = 0;
        ProductoFacadeImpl instance = new ProductoFacadeImpl();
        ProductoDto1 expResult = null;
        ProductoDto1 result = instance.listarProductoId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
