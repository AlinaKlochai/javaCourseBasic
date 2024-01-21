package homeworks.homework04;

//Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки:
//```console
//"Меня зовут ..."
//"Мне ... лет"
//"Я из ..."

public class Task1 {
    public static void main(String[] args) {
        String namePerson1 = "Алина Клочай";
        int agePerson1 = 27;
        String countryPerson1 = "Украины";

        System.out.println("Решение задачи 1: ");
        System.out.println("Меня зовут " + namePerson1 + ".");
        System.out.println("Мне " + agePerson1 + " лет" + ".");
        System.out.println("Я из " + countryPerson1 + ".");
    }
}
