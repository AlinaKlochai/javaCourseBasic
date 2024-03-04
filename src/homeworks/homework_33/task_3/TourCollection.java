package homeworks.homework_33.task_3;

import java.util.ArrayDeque;
import java.util.Queue;

public class TourCollection {
   private Queue<String> tourCollection;
   private int maxSize;

    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
        this.tourCollection = new ArrayDeque<>();
    }

    public Queue<String> getTourCollection() {
        return tourCollection;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addRequest(String request){
        if (tourCollection.size() < maxSize){
            tourCollection.offer(request);
            System.out.println("Запрос успешно добавлен");
        } else {
            System.out.println("Запрос не добавлен");
        }
    }

    public void processRequest(){
        if(!tourCollection.isEmpty()){
           String reqest =  tourCollection.poll();
            System.out.println("Запрос " + reqest + " обработан");
        }else {
            System.out.println("Список запросов пуст");
        }
    }

    public int getQueueSize(){
        System.out.println("Размер текущего списка запросов:");
       return tourCollection.size();
    }

    @Override
    public String toString() {
        return "TourCollection{" +
                "tourCollection=" + tourCollection +
                '}';
    }
}
