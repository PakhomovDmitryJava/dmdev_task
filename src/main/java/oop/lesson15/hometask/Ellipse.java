package oop.lesson15.hometask;

public class Ellipse extends Circle {
    double maxRadius;
    double minRadius;

    public Ellipse(double maxRadius, double minRadius) {
        super(maxRadius);
        this.minRadius = minRadius;
    }

    @Override
    public double findSquare() {
        return Math.PI * minRadius * maxRadius;
    }


    @Override
    public boolean squareComparison(Shape shape) {
        return this.findSquare() == shape.findSquare();
    }

    public double getMaxRadius() {
        return maxRadius;
    }

    public double getMinRadius() {
        return minRadius;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "maxRadius=" + maxRadius +
                ", minRadius=" + minRadius +
                '}';
    }
}
