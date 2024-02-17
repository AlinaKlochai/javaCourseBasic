package homeworks.homework_21.abstraction.task_3;

abstract class NavigationSystem {
    private String producer;
    private String model;


    public void startWorkDisplay(){
        System.out.println("Добрый день, сегодня прекрасная погода для путешествий!");

    }

    abstract void startNavigation();

    abstract void stopNavigation();



}
