package Factories;

import Shapes.Circle;
import Shapes.Interfaces.Shape;
import Shapes.Square;
import Shapes.Triangle;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
