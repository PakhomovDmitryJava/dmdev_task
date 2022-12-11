package hometask7;

public class SuperGiantStar extends Star {

    public SuperGiantStar(String name, long mass, long radius, boolean isShining) {
        super(name, mass, radius, isShining);
    }

    @Override
    public void shine() {
        System.out.println("The SuperGiantStar is shining!");
    }
}
