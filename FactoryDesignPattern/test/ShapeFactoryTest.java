/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kruti
 * @version 1.0
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    // instance of ShapeFactory
        ShapeFactory sh = new ShapeFactory();
        
    /**
     * Test of getShape method
     */
    @Test
    public void testGetShape() {
        // Validate if null is returned when the input is null
        assertTrue(sh.getShape(null) == null); 
    }
    
    /**
     * Test of getShape method
     */
    @Test
    public void testGetShape_circle() {
        // Check if the "circle" input returns an instance of the Circle class.
        assertTrue(sh.getShape("circle") instanceof Circle);
    }
    
    /**
     * Test of getShape method
     */
    @Test
    public void testGetShape_rectangle() {
        // Check if the "rectangle" input returns an instance of the rectangle class.
        assertTrue(sh.getShape("rectangle") instanceof Rectangle);
    }
    
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape_square() {
        // Check if the "sqaure" input returns an instance of the sqare class.
        assertTrue(sh.getShape("square") instanceof Square);
    }
    
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape_null() {
        // Validate if null is returned for an unknown shape
        assertTrue(sh.getShape("unknown") == null);
    }
    
    
}
