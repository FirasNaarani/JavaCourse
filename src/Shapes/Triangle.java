package Shapes;
import Shapes.Interfaces.Shape;
public class Triangle implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside Triangle Draw method.");
    }
}
