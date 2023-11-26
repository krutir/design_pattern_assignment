/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * ShapeFactory provides methods for getting instances of shapes without knowing their classes.
 *
 * @author Kruti
 * @version 1.0
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
