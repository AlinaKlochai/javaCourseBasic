package lessons.lesson_27;

import java.util.List;

public class Mentor {
    private String nameOfModerator;
    List<Kurs> kurs;

    public Mentor(String nameOfModerator, List<Kurs> kurs) {
        this.nameOfModerator = nameOfModerator;
        this.kurs = kurs;
    }

    public String getNameOfModerator() {
        return nameOfModerator;
    }

    public List<Kurs> getKurs() {
        return kurs;
    }
}
