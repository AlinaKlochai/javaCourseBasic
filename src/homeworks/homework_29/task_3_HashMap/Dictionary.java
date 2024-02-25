package homeworks.homework_29.task_3_HashMap;


import scanner.UserInput;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("Apple","Apfel");
        dictionary.put("Banana","Banane");
        dictionary.put("Importance","Wichtigkeit");
        dictionary.put("Institution","Anstalt");
        dictionary.put("Tongue", "Zunge");


        System.out.println("Список слов:");
        for (Map.Entry<String,String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Выведите перевод слова, введенного пользователем.

        UserInput userInput = new UserInput();
        String wordForTranslation = userInput.inputText("Введите слово для перевода с большой буквы: ");

        boolean wordFound = false;
        for (Map.Entry<String,String> entry : dictionary.entrySet()){
            if (entry.getKey().equalsIgnoreCase(wordForTranslation)){
                System.out.println("Перевод слова " + wordForTranslation + " -> " + entry.getValue() );
                dictionary.remove(entry.getKey());     // удаляем введенное слово из списка слов
                wordFound = true;
                break;                   // Если слово найдено, выходим из цикла
            }
        }

        if(!wordFound){
            System.out.println("Слово " + wordForTranslation + " не найдено в словаре.");
        }

        //Удалите слово из словаря и выведите обновленный список слов

        System.out.println("Обновленный список слов:");
        for (Map.Entry<String,String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }







    }
}
