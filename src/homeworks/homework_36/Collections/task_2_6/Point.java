package homeworks.homework_36.Collections.task_2_6;

public class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public int compareTo(Point other) {
        if (this.x > other.x) {
            return 1;
        } else if (this.x < other.x) {
            return -1;
        } else {
            return Integer.compare(this.y, other.y);
        }
    }
}
