package homeworks.homework_14.task5;

public class PenDemo {
    public static void main(String[] args) {

        // 2. Создайте класс PenDemo (метод main)
        // 3. Создайте три объекта типа Pen

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        // 4. Создайте массив L = 3

        Pen[] pensArray = new Pen [3];

        // 5. Сохраните все объекты в массив

        pensArray[0] = pen1;
        pensArray[1] = pen2;
        pensArray[2] = pen3;

        // 6. Достаньте поочередно из массива ручки и измените цвет каждой на
        //             a. “Green”
        //             b. “Red”
        //             c. “Black”

        pensArray[0].setColor("Green");
        pensArray[1].setColor("Red");
        pensArray[2].setColor("Black");

        // 7. Распечатайте цвета ручек из массива
        System.out.println("Color Pen 1: " + pensArray[0].getColor());
        System.out.println("Color Pen 2: " + pensArray[1].getColor());
        System.out.println("Color Pen 3: " + pensArray[2].getColor());

    }
}
