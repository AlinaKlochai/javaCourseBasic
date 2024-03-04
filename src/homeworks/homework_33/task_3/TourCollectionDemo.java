package homeworks.homework_33.task_3;

import java.util.Queue;

public class TourCollectionDemo {
    public static void main(String[] args) {
        TourCollection tourCollection = new TourCollection(10);
        tourCollection.addRequest("Испания");
        tourCollection.addRequest("Италия");
        tourCollection.addRequest("Франция");
        tourCollection.addRequest("Мадрид");
        tourCollection.addRequest("Египед");

        System.out.println(tourCollection);

        int currentSize = tourCollection.getQueueSize();
        System.out.println(currentSize);

        tourCollection.processRequest();



    }
}
