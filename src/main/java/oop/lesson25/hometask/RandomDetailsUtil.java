package oop.lesson25.hometask;

import oop.lesson25.task.RandomUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class RandomDetailsUtil {
    private static final int FIRST_NIGHT_DETAILS_COUNT = 20;
    private static final int EVERY_NIGHT_MAX_DETAILS_COUNT = 4;

    private static final List<RobotDetails> DETAILS_FOR_ONE_ROBOT = Arrays.asList(RobotDetails.values());

    public RandomDetailsUtil() {
    }

    public static List<RobotDetails> getFirstNightDetails() {
        List<RobotDetails> details = new ArrayList<>();
        for (int i = 0; i < FIRST_NIGHT_DETAILS_COUNT; i++) {
            details.add(DETAILS_FOR_ONE_ROBOT.get(RandomUtil.getRandom(DETAILS_FOR_ONE_ROBOT.size())));
        }
        return details;
    }
    public static List<RobotDetails> getFirstNightDetails(int startValue) {
        List<RobotDetails> details = new ArrayList<>();
        for (int i = 0; i < startValue; i++) {
            details.add(DETAILS_FOR_ONE_ROBOT.get(RandomUtil.getRandom(DETAILS_FOR_ONE_ROBOT.size())));
        }
        return details;
    }

    public static List<RobotDetails> getEveryNightDetails() {
        List<RobotDetails> details = new ArrayList<>();
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, EVERY_NIGHT_MAX_DETAILS_COUNT + 1); i++) {
            details.add(DETAILS_FOR_ONE_ROBOT.get(RandomUtil.getRandom(DETAILS_FOR_ONE_ROBOT.size())));
        }
        return details;
    }

    public static List<RobotDetails> getRandomDetailsFromJunkyard(List<RobotDetails> junkyardDetails) {
        List<RobotDetails> detailsForScientist = new ArrayList<>();
        int detailsCount = RandomUtil.getRandomFromDiapason();
        for (int i = 0; i < detailsCount; i++) {
            if (!junkyardDetails.isEmpty()) {
                int randomIndex = ThreadLocalRandom.current().nextInt(junkyardDetails.size());
                RobotDetails randomDetail = junkyardDetails.get(randomIndex);
                detailsForScientist.add(randomDetail);
                System.out.println("The robot-minion came to master with " + randomDetail);
                junkyardDetails.remove(randomIndex);
            } else {
                detailsForScientist.add(null);
            }
        }
        return detailsForScientist;
    }




}


