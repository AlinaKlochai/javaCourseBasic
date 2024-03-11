package consultations.cons_15;

import java.util.function.Function;

public class TextExample {
    public static void main(String[] args) {
        String requestText = "Пример текста запроса";
        int requestValue = 250;
        String result = processRequest(requestText, requestValue);
        System.out.println(result);

        System.out.println("var_2");
        int requestValue2 = 350;
        String result2 = processRequest2(requestText,requestValue2);
        System.out.println(result2);


    }

    public static String processRequest(String text, int value) {
        // Проверяем корректность данных
        if (text.length() < 10) {
            return "Длина сообщения должна быть не менее 10 символов";
        }

        // Обрабатываем значение
        if (value >= 100 && value < 200) {
            return "Запрос получен";

        } else if (value >= 200 && value < 300) {
            return "Ок";
        } else if (value >= 300 && value < 400) {
            return "Сервисный запрос";
        } else if (value >= 400 && value < 500) {
            return "Ошибка пользователя";
        } else if (value >= 500 && value <= 550) {
            return "Ошибка сервера";
        } else {
            return "Некорректное значение";
        }
    }

    public static String processRequest2(String text, int value) {
        // Проверяем корректность данных
        if (text.length() < 10) {
            return "Длина сообщения должна быть не менее 10 символов";
        }
        Function<Integer, String> processor = v -> {
            if (v >= 100 && v < 200) {
                return "Запрос получен";
            } else if (v >= 200 && v < 300) {
                return "Ок";
            } else if (v >= 300 && v < 400) {
                return "Сервисный запрос";
            } else if (v >= 400 && v < 500) {
                return "Ошибка пользователя";
            } else if (v >= 500 && v <= 550) {
                return "Ошибка сервера";
            } else {
                return "Некорректное значение";
            }
        };
        return processor.apply(value);
    }
}

