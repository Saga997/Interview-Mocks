package org.zaidism.solidPrinciples.OpenAndClosed;

public class ShapeMain {
    public static void main(String[] args)
    {
        Circle circle = new Circle(7);
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(5,8);
        System.out.println(rectangle.calculateArea());

        Square square = new Square(8);
        System.out.println(square.calculateArea());
    }
}
