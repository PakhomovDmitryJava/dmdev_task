package oop.lesson15.hometask;

public class Rectangle implements Shape {
        private double aSide;
        private double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public Rectangle(double aSide) {
        this.aSide = aSide;
    }

    @Override
    public double findSquare() {
        return aSide * bSide;
    }

    @Override
    public boolean squareComparison(Shape shape) {
        return this.findSquare() == shape.findSquare();
    }

    public double getASide() {
        return aSide;
    }

    public void setASide(double aSide) {
        this.aSide = aSide;
    }

    public double getBSide() {
        return bSide;
    }

    public void setBSide(double bSide) {
        this.bSide = bSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                '}';
    }
}
