package homeworks.homework_09.task4;

//Ваш ребенок принес оценку за контрольную работу по математике. В школе 12 бальная система.
//Запишите в переменную случайное число от 0 до 12.
//Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.  (Оставшееся время не может быть больше 1 часа)
//На сегодня у него осталось 45 минут. (записать в переменную)
//
//Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
//от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
//от 4 до 6 -> Нейтральные слова + ко времени 15 минут
//3 -> Огорчитесь. Минус 30 минут ко времени
//оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено

public class MyChild {
    public static void main(String[] args) {

        int minGrade = 0;
        int maxGrade = 12;
        int randomGrade = (int) (Math.random() * (maxGrade - minGrade ) + minGrade);

        System.out.println(randomGrade);

        int timeForTYWatching = 45;

        switch (randomGrade){
            case 12:
            case 11:
            case 10:
                System.out.println("Я очень рада! Добавляю тебе еще один час к просмотру TV. " + (timeForTYWatching + 60));
                break;
            case 9:
            case 8:
            case 7:
                    System.out.println("Ты молодец! Можешь посмотреть на 45 минут TV больше. " + (timeForTYWatching + 45));
                    break;
            case 6:
            case 5:
            case 4:
                System.out.println("Окей. Можешь посмотреть на 15 минут TV больше. " + (timeForTYWatching + 15));
                break;
           case 3:
                System.out.println("Очень печально, сегодня на 30 минут меньще смотриш Tv" + (timeForTYWatching - 30));
                break;
            default:
                System.out.println("Сегодня никакого TV!!!");


        }

    }

}
