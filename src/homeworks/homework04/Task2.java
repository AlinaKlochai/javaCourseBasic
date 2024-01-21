package homeworks.homework04;

//Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
//Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
//Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
//Распечатайте её через println. Сколько программа отбросила в дробной части?
public class Task2 {
    public static void main(String[] args) {

        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        int var5 = 4;
        int var6 = 5;
        int var7 = 6;
        int var8 = 7;
        int var9 = 8;
        int var10 = 9;

        int sum = var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10;
        int averageSum = sum / 10;
        // Выыодим среднее арифметическое всех переменных
        System.out.println("Среднее арифметическое: " + averageSum);

        // Вывод дробной части, которую программа отбросила.
        int remainder = sum % 10;
        System.out.println("Программа отбросила в дробной части: " + remainder);
    }
}
