package homeworks.homework_21.abstraction.task_2;

public class Guitar extends MusicalInstrument{
    public Guitar(String nameOfMusicalInstrument) {
        super(nameOfMusicalInstrument);
    }

    @Override
    void playNote() {
        System.out.println("Bryn!");
    }
}
