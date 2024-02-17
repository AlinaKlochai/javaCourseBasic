package homeworks.homework_21.incapsulation.task_3;
/*
Разработайте класс `SystemConfiguration`, который хранит конфигурационные
параметры системы (например, уровень логирования, путь к файлам логов).
Доступ к изменению этих параметров должен быть строго контролируемым через
методы, предотвращающие установку некорректных значений.

 */

public class SystemConfiguration {
    private int logLevel;
    private String logFilePath;


    public int getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogLevel(int logLevel){
        if (logLevel >= 0 && logLevel <= 10){
            this.logLevel = logLevel;
        }else {
            System.out.println("Невозможно изменить данные, они указаны неккоректно.");
        }
    }

}
