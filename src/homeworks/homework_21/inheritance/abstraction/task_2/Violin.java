package homeworks.homework_21.inheritance.abstraction.task_2;

public class Violin extends MusicalInstrument{
    public Violin(String nameOfMusicalInstrument) {
        super(nameOfMusicalInstrument);
    }

    @Override
    void playNote() {
        System.out.println("Playing piano: Vee-e!");
    }
}
