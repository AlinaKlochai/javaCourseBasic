package homeworks.homework_36.Generics.task_3;

public class Pairs <F,S> {
    private F first;
    private S second;

    public Pairs(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    public void printInfo(){
        System.out.println("Первый: " + getFirst());
        System.out.println("Второй: " + getSecond());
    }
}
