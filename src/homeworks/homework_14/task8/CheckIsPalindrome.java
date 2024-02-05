package homeworks.homework_14.task8;

public class CheckIsPalindrome {

    //создаем метод, в который передаем строку введенную пользователем
    public boolean isPalindrome(String myString) {

        // Удаляем пробелы и приводим строку к нижнему регистру
        myString = myString.replaceAll("\\s", "").toLowerCase();


        //left и right - это указатели, которые будут двигаться к центру строки для сравнения символов.
        int left = 0;                          //указатель который идет с начала строки
        int right = myString.length() - 1;     //указатель который идет с концв строки

        while (left < right) {
            if (myString.charAt(left) != myString.charAt(right)) {  // сравнение каждого символа в строке
                return false;              // Если символы не совпадают, строка не палиндром
            }
            left++;                     // В противном случае, если символы совпадают,
            right--;                    // указатели двигаются к центру строки (left++, right--), продолжая сравнение.
        }

        return true;               // Если все символы совпадают, строка палиндром

    }
}
