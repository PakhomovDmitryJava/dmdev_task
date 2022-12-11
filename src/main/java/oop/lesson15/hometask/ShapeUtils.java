package oop.lesson15.hometask;

public class ShapeUtils {

    public ShapeUtils() {
    }

    public static boolean isRectangle(Shape shape) {
        return (shape instanceof Rectangle);
    }

    public static boolean isTriangle(Shape shape) {
        return (shape instanceof Triangle);
    }

}
