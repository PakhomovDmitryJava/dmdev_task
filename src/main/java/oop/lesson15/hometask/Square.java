package oop.lesson15.hometask;

public class Square extends Rectangle {

    public Square(double aSide) {
        super(aSide);
    }

    @Override
    public double findSquare() {
        return Math.pow(this.getASide(), 2);
    }

}
