package homeworks.homework_21.abstraction.task_3;

public class CarNavigationSystem extends NavigationSystem {

    @Override
    void startNavigation() {
        System.out.println("Машина начала свое движение.");

    }

    @Override
    void stopNavigation() {
        System.out.println("Машина остановилась.");

    }
}
