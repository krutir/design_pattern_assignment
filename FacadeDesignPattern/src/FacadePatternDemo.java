/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Facade design pattern example.
 * 
 * @author Kruti
 * @version 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker= new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
