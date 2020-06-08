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
    
    TArbolBB arbol1, arbol2, arbol3;
    TElementoAB elem1, elem2, elem3,elem4;
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
        arbol3 = new TArbolBB();
        elem1 = new TElementoAB(1,null);
        elem2 = new TElementoAB(2,null);
        elem3 = new TElementoAB(3,null);
        elem4 = new TElementoAB(4,null);
        arbol2.insertar(elem1);
        arbol3.insertar(elem3);
        arbol3.insertar(elem2);
        arbol3.insertar(elem4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test del metodo calcularCosto con un arbol Vacio
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
     * Test del metodo calcularCosto con un arbol con Raiz
     */
    @Test
    public void testCalcularCostoArbolRaiz() {
        setUp();
        int[] FrecExito = new int[2];
        FrecExito[1] = 3;
        int[] FrecNoExito = {5,6};
        int expResult = 3 + 5*2 + 6*2;
        long result = arbol2.calcularCosto(FrecExito, FrecNoExito);
        assertEquals(expResult, result);
    }
    
    /**
     * Test del metodo calcularCosto en un arbol con una raiz
     * y algunos elementos
     */
    @Test
    public void testCalcularCostoArbolVariosElem() {
        setUp();
        int[] FrecExito = new int [4];
        FrecExito[1] = 4;
        FrecExito[2] = 3;
        FrecExito[3] = 2;
        int[] FrecNoExito = {5,6,4,2};
        int expResult = 3*1 + 2*(4 + 2) + 3*(5 + 6 + 4 + 2);
        long result = arbol3.calcularCosto(FrecExito, FrecNoExito);
        assertEquals(expResult, result);
    }
}
