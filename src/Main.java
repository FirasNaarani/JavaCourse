import Factories.ShapeFactory;
import Shapes.Interfaces.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyClass firstClass = new MyClass();
        firstClass.run();

        Scanner myScanner = new Scanner(System.in);
        String a,b;
        System.out.println("Enter a word:");
        a = myScanner.next();

        System.out.println("Enter another word:");
        b = myScanner.next();

        System.out.println(firstClass.AddStrings(a,b));

        MySecondClass secondClass1 = new MySecondClass(1);
        MySecondClass secondClass2 = new MySecondClass(2,3);
        MySecondClass secondClass3 = new MySecondClass(4,5);
        MySecondClass secondClass4 = new MySecondClass(6);

        System.out.println("Enter a number:");
        System.out.println(MySecondClass.DoubleMe(myScanner.nextInt()));

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.Draw();

        Shape shape2 = shapeFactory.getShape("TRIANGLE");
        shape2.Draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.Draw();
    }
}