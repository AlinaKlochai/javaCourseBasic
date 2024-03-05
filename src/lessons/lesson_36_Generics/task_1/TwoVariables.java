package lessons.lesson_36_Generics.task_1;

public class TwoVariables <T, U>{
    private T var1;
    private U var2;

    public TwoVariables(T var1, U var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public U getVar2() {
        return var2;
    }

    public void printInfo(){
        System.out.println("Первый тип: " + getVar1());
        System.out.println("Второй тип: " + getVar2());
    }
}
