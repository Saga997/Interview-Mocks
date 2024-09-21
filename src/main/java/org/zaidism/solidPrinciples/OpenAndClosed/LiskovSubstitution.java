package org.zaidism.solidPrinciples.OpenAndClosed;

public class LiskovSubstitution {

    public static void main(String[] args)
    {
        Shape circle = new Circle(7);  //
        System.out.println(circle.calculateArea());

        Shape rectangle = new Rectangle(5,8);//The new keyword allocates memory on the heap for the new Rectangle object.
        System.out.println(rectangle.calculateArea());

        Shape square = new Square(8);
        System.out.println(square.calculateArea());
    }


}

    /*
/*Method Call: When you call rectangle.calculateArea(), even though rectangle is of type Shape, the JVM knows that it
actually holds a Rectangle object. Therefore, it calls the calculateArea method defined in the Rectangle class.

The Open/Closed Principle states that software entities (like classes, modules, functions, etc.) should be open for
extension but closed for modification. This means that the behavior of a module can be extended without modifying its source code.

The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of a subclass
without affecting the correctness of the program. In simpler terms, if S is a subtype of T, then objects of type T
should be replaceable with objects of type S without altering the desirable properties of the program
     */

