package homeworks.extraHomework.addHomework2.task_22;

public class MethodsDog {
    private String name;
    private int age;
    private String color;

    public MethodsDog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice(){
        System.out.println("Кличка: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Цвет собаки: " + color);
    }

    public void changeColor(String newColor){
        color = newColor;
        System.out.println("Цвет собаки изменен на; " + color);
    }
}
