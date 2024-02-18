package homeworks.extraHomework.addHomework2.task_20;

public class MethodsDog {
    private String name;
    private int age;

    public MethodsDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void voice(){
        System.out.println(this.name);
        System.out.println(this.name);
        System.out.println(this.name);
    }


    public void happyBirthday(){
        System.out.println("Today " + getName() + " has a Birthday");
        System.out.println(getName() + " has " + (getAge() + 1) + " year");
    }
}
