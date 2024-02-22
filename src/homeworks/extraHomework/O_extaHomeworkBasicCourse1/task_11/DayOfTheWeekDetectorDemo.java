package homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_11;

import homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_7.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();

       String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }
}
