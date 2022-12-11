package oop.lesson15.hometask;

public class Round extends Circle {
    public Round(double radius) {
        super(radius);
    }

    @Override
    public double findSquare() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Round{" +
                "radius=" + radius +
                '}';
    }
}
