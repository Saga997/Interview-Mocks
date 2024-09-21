package org.zaidism.solidPrinciples.OpenAndClosed;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
}
