package hometask7;

public class SpaceRunner {
    public static void main(String[] args) {

        Star giantStar = new GiantStar("Sun", 100_000_000_000_000_000L,
                100_000_000_000_000_000L, true);
        Meteorite tungusky = new Meteorite("Tungusky", 100000000L, 1000000L);
        Asteroid asteroid = new Asteroid("1",1000000,100000000, giantStar);
        System.out.println(giantStar.isShining());
        System.out.println(asteroid.getStarOrbit());
        EarthLikePlanet earthLikePlanet = new EarthLikePlanet("Earth",10000000000L,
                100001000000L, true);
        System.out.println(earthLikePlanet.isInhabited());
        earthLikePlanet.armageddon(tungusky);
        System.out.println(earthLikePlanet.isInhabited());
        System.out.println(SpaceUtils.attractiveForce(giantStar,tungusky,10));
        System.out.println(SpaceUtils.isAStar(giantStar));
        System.out.println(SpaceUtils.isAStar(asteroid));
        System.out.println(asteroid.diameter());
        System.out.println(earthLikePlanet.diameter());
        earthLikePlanet.compareMass(asteroid);
        giantStar.shine();
        earthLikePlanet.rotate();

    }
}
