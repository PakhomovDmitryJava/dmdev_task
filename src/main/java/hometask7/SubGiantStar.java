package hometask7;

public class SubGiantStar extends Star {

    public SubGiantStar(String name, long mass, long radius, boolean isShining) {
        super(name, mass, radius, isShining);
    }

    @Override
    public void shine() {
        System.out.println("The SubGiantStar is shining!");
    }
}
