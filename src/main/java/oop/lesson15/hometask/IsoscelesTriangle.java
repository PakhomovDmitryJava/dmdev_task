package oop.lesson15.hometask;

public class IsoscelesTriangle extends Triangle {
    private double height;

    public IsoscelesTriangle(double sideA, double sideB, double height) {
        super(sideA, sideB);
        this.height = height;
    }

    @Override
    public double findSquare() {
        return (height * this.getSideB()) / 2;
    }
}
