package oop.lesson25.hometask;

import java.util.List;

public class ProducerRobotDetailsThread implements Runnable {
    private final List<RobotDetails> junkyardDetails;

    public ProducerRobotDetailsThread(List<RobotDetails> junkyardDetails) {
        this.junkyardDetails = junkyardDetails;
    }

    @Override
    public void run() {
        synchronized (junkyardDetails) {
            while (true) {
                try {
                    List<RobotDetails> detailsFromPlantToJunk = RandomDetailsUtil.getFirstNightDetails();
                    detailsFromPlantToJunk.forEach(detail -> System.out.println(detail.toString() + " to junk!"));
                    junkyardDetails.addAll(detailsFromPlantToJunk);
                    junkyardDetails.notifyAll();
                    junkyardDetails.wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
