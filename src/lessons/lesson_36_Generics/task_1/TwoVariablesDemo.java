package lessons.lesson_36_Generics.task_1;

public class TwoVariablesDemo {
    public static void main(String[] args) {
        TwoVariables<String, Integer> stringInteger = new TwoVariables<>("Table",1);
        stringInteger.printInfo();

        System.out.println("______________________________");
        TwoVariables<Integer,String> integerString = new TwoVariables<>(1,"Table");
        integerString.printInfo();

    }
}
