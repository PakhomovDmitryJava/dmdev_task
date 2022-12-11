package oop.lesson25.task;

import java.util.concurrent.ThreadLocalRandom;

public final class RandomUtil {
    private static final int DEFAULT_BOUND = 10;
    private static final int MIN = 1;
    private static final int MAX = 4;

    private RandomUtil() {
    }

    public static int getRandom(int bound) {
        return ThreadLocalRandom.current().nextInt(bound);
    }
    public static int getRandomFromDiapason(int statInclude, int endInclude) {
        return ThreadLocalRandom.current().nextInt(statInclude,endInclude+1);
    }

    public static int getRandomFromDiapason() {
        return ThreadLocalRandom.current().nextInt(MIN, MAX +1);
    }

    public static int getRandom() {
        return ThreadLocalRandom.current().nextInt(DEFAULT_BOUND);
    }
}

