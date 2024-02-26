package lessons.lesson_29.task_1_Map;

public class Info {
    private String subject;
    private double grace;

    public Info(String subject, double grace) {
        this.subject = subject;
        this.grace = grace;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrace() {
        return grace;
    }

    @Override
    public String toString() {
        return "Grace{" +
                "subject='" + subject + '\'' +
                ", grace=" + grace +
                '}';
    }
}
