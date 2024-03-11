package homeworks.homework_36.Collections.task_2_6;

import java.util.TreeSet;

public class TreeSetXY {

    public static void main(String[] args) {
        TreeSet<Point> points = new TreeSet<>();
        points.add(new Point(1, 5));
        points.add(new Point(5, 1));
        points.add(new Point(2, 3));
        points.add(new Point(3, 2));
        points.add(new Point(6, 4));

        System.out.println("Points where x > y");
        for (Point point : points) {
            if (point.x > point.y) {
                System.out.println(point);
            }

        }
    }
}
