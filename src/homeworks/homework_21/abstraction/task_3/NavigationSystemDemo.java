package homeworks.homework_21.abstraction.task_3;

public class NavigationSystemDemo {
    public static void main(String[] args) {

        CarNavigationSystem car = new CarNavigationSystem();
        MarineNavigationSystem marine = new MarineNavigationSystem();

        car.startWorkDisplay();
        car.startNavigation();
        car.stopNavigation();
        System.out.println("-------------------");
        marine.startWorkDisplay();
        marine.startNavigation();
        marine.stopNavigation();
    }
}
