package homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_9;

import homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_7.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();

       String myDay = detector.findDayOfTheWeek(dayNumber);
        System.out.println(myDay);
    }
}
