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
 * @author valentina
 */
public class TArbolBBTest {
    
    TArbolBB arbol1, arbol2;
    TElementoAB elem1, elem2, elem3;
    public TArbolBBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arbol1 = new TArbolBB();
        arbol2 = new TArbolBB();
        elem1 = new TElementoAB(1,null);
        elem2 = new TElementoAB(2,null);
        elem3 = new TElementoAB(3,null);
        arbol2.insertar(elem1);
        arbol2.insertar(elem2);
        arbol2.insertar(elem3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularCosto method, of class TArbolBB. (with empty tree)
     */
    @Test
    public void testCalcularCostoArbolVacio() {
        setUp();
        int[] FrecExito = {0};
        int[] FrecNoExito = {0};
        int expResult = 0;
        long result = arbol1.calcularCosto(FrecExito, FrecNoExito);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of calcularCosto method, of class TArbolBB.
     */
    @Test
    public void testCalcularCosto() {
        setUp();
        int[] FrecExito = {0};
        int[] FrecNoExito = {0};
        int expResult = 43;
        long result = arbol2.calcularCosto(FrecExito, FrecNoExito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
