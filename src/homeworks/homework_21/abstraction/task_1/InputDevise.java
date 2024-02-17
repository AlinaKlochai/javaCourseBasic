package homeworks.homework_21.abstraction.task_1;
/*Создайте абстрактный класс InputDevice, который включает абстрактные методы connect и disconnect,
а также может содержать поля или неабстрактные методы, общие для всех устройств ввода.
От этого абстрактного класса наследуйте классы Keyboard и Mouse, реализуя абстрактные методы.
 */
abstract class InputDevise {
    private String producer;
    private String model;

    public InputDevise(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    abstract void connect();
    abstract void disconnect();

}
