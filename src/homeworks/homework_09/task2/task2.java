package homeworks.homework_09.task2;

//- Запишите в 4 переменные случайные числа от 0 до 100
//- Выведите все 4 на экран
//- Программа должна определить максимальное из этих четырех чисел
//- Результат вывести на экран
public class task2 {
    public static void main(String[] args) {

        // создаем 4 рандомных чисел от 0 до 100 через формулу
        // min + random() * ( max - min + 1)
        // Math.random() * ( max - min + 1)

        double random1 = Math.random() * ( 100 - 0 + 1) + 0;
        double random1Round = Math.round(random1);
        System.out.println("1st random example: " + random1Round);

        double random2 = Math.random() * ( 100 - 0 + 1) + 0;
        double random2Round = Math.round(random2);
        System.out.println("2st random example: " + random2Round);

        double random3 = Math.random() * ( 100 - 0 + 1) + 0;
        double random3Round = Math.round(random3);
        System.out.println("3st random example: " + random3Round);

        double random4 = Math.random() * ( 100 - 0 + 1) + 0;
        double random4Round = Math.round(random4);
        System.out.println("4st random example: " + random4Round);


        // Определяем максимальное число

        double maxRandomNumber = Math.max(Math.max(random1Round, random2Round), Math.max(random3Round, random4Round));
        System.out.println("Максимальное число из предложенних рандомных чисел: " + maxRandomNumber);



    }
}
