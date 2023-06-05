package Shapes;
import Shapes.Interfaces.Shape;
public class Square implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside Square Draw method.");
    }
}
