package homeworks.homework_36.Generics.task_1;
/*
    Создайте класс Box для хранения любых объектов и реализуйте методы
    get() и put() для чтения и записи объектов в коробку.
    Используйте Generics для обеспечения типобезопасности.

 */
public class Box <T>{
    private T object;

    //метод для чтения объектов в коробке
    public T get(){
        return this.object;
    }

    public void put(T object){
        this.object = object;
    }
}
