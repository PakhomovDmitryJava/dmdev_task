package oop.lesson15.hometask;

public class Triangle implements Shape {
        private  double sideA;
    private  double sideB;
    private  double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Triangle(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double findSquare() {
        double halfP = this.findHalfP();
        return Math.sqrt(halfP * (halfP - this.getSideA()) * (halfP - this.getSideB()) * (halfP - this.getSideC()));
    }


    @Override
    public boolean squareComparison(Shape shape) {
        return this.findSquare() == shape.findSquare();
    }

    public double findHalfP() {
        return (this.getSideA() + this.getSideB() + this.getSideC()) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
