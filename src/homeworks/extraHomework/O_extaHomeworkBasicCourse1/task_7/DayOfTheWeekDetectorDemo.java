package homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_7;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();

       String myDay = detector.findDayOfTheWeek(dayNumber);
        System.out.println(myDay);
    }
}
