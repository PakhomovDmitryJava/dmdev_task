package oop.lesson25.hometask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConsumerRobotDetailsThread implements Runnable {
    private final List<RobotDetails> junkyardDetails;
    private boolean isActive = true;

    public ConsumerRobotDetailsThread(List<RobotDetails> junkyardDetails) {
        this.junkyardDetails = junkyardDetails;
    }

    @Override
    public void run() {
        synchronized (junkyardDetails) {
            List<RobotDetails> scientistDetails = new ArrayList<>();
            int maidenRobotCounter = 0;
            while (isActive) {
                if (!junkyardDetails.isEmpty()) {
                    List<RobotDetails> randomDetailsFromJunkyard = RandomDetailsUtil.getRandomDetailsFromJunkyard(junkyardDetails);
                    if (!randomDetailsFromJunkyard.isEmpty()) {
                        try {
                            scientistDetails.addAll(randomDetailsFromJunkyard);
                            junkyardDetails.removeAll(randomDetailsFromJunkyard);
                            while (new HashSet<>(scientistDetails).containsAll(Set.of(RobotDetails.values()))) {
                                maidenRobotCounter++;
                                System.out.println("The scientist from " + Thread.currentThread().getName() + " made a robot! Number of robots = " + maidenRobotCounter);
                                if (maidenRobotCounter == 100) {
                                    System.out.println("The scientist from " + Thread.currentThread().getName() + " made 100 robot! He won!");
                                    isActive = false;
                                }
                                for (RobotDetails detail : RobotDetails.values()) {
                                    scientistDetails.remove(detail);
                                }
                            }
                            junkyardDetails.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("There were no details at junkyard!");
                        try {
                            junkyardDetails.wait(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

}
