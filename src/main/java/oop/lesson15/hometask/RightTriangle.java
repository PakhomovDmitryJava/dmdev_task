package oop.lesson15.hometask;

public class RightTriangle extends Triangle {

    public RightTriangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double findSquare() {
        return (this.getSideA() * this.getSideB()) / 2;
    }


}
