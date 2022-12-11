package oop.lesson15.hometask;

public abstract class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean squareComparison(Shape shape) {
        return this.findSquare() == shape.findSquare();
    }


}
