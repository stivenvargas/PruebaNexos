/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ProductoControllerTest {
    
    public ProductoControllerTest() {
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
     * Test of inicio method, of class ProductoController.
     */
    @Test
    public void testInicio() {
        System.out.println("inicio");
        ProductoController instance = new ProductoController();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getTestOk() != 0) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of init method, of class ProductoController.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.init();
        assertEquals("home", result);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getTestOk() != 0) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of consultarProducto method, of class ProductoController.
     */
    @Test
    public void testConsultarProducto() {
        System.out.println("consultarProducto");
        int test=0;
        int id = 2;
        ProductoController instance = new ProductoController();
        test=instance.consultarProducto(id);
        // TODO review the generated test code and remove the default call to fail.
        if (test != 0) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of hacerCompra method, of class ProductoController.
     */
    @Test
    public void testHacerCompra() {
        System.out.println("hacerCompra");
        int id = 0;
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.hacerCompra(id);
        assertEquals("Carrito", result);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getTestOk() != 0) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of realizarPago method, of class ProductoController.
     */
    @Test
    public void testRealizarPago() {
        System.out.println("realizarPago");
        ProductoController instance = new ProductoController();
        instance.realizarPago();
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getTestOk() != 0) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminarProducto method, of class ProductoController.
     */
    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        int id = 0;
        ProductoController instance = new ProductoController();
        instance.eliminarProducto(id);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getTestOk() != 0) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of verCarrito method, of class ProductoController.
     */
    @Test
    public void testVerCarrito() {
        System.out.println("verCarrito");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.verCarrito();
        assertEquals("Carrito", result);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getTestOk() != 0) {
            fail("The test case is a prototype.");
        }
    }
}
