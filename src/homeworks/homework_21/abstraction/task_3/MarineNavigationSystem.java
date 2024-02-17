package homeworks.homework_21.abstraction.task_3;

public class MarineNavigationSystem extends NavigationSystem{


    @Override
    void startNavigation() {
        System.out.println("Судно начало свое движение.");

    }

    @Override
    void stopNavigation() {
        System.out.println("Судно остановилось.");

    }
}
