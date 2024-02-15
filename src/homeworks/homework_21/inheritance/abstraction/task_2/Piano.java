package homeworks.homework_21.inheritance.abstraction.task_2;

public class Piano extends MusicalInstrument{
    public Piano(String nameOfMusicalInstrument) {
        super(nameOfMusicalInstrument);
    }

    @Override
    void playNote() {
        System.out.println("La-la-la!");

    }
}
