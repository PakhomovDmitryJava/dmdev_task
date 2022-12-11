package hometask7;

import java.math.BigDecimal;

public final class SpaceUtils {
    private static final BigDecimal GRAVITATIONAL_CONSTANT = BigDecimal.valueOf(6.67).multiply(BigDecimal.valueOf(Math.pow(10, -11)));

    private SpaceUtils() {
    }

    public static BigDecimal attractiveForce(SpaceObject spaceObject1, SpaceObject spaceObject2, double distance) {
        BigDecimal mass1 = BigDecimal.valueOf(spaceObject1.getMass());
        BigDecimal mass2 = BigDecimal.valueOf(spaceObject2.getMass());
        BigDecimal distanceBig = BigDecimal.valueOf(distance).pow(2);
        return (mass2.multiply(GRAVITATIONAL_CONSTANT.multiply(mass1))).divide(distanceBig);

    }

    public static boolean isAStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }

}
