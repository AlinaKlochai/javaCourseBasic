package homeworks.homework_21.inheritance.abstraction.task_2;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {
        Violin violin = new Violin("Violin Ocean");
        Piano piano = new Piano("Piano");
        Guitar guitar = new Guitar("Guitar");

        violin.getNameOfMusicalInstrument();
        violin.playNote();

        piano.getNameOfMusicalInstrument();
        piano.playNote();

        guitar.getNameOfMusicalInstrument();
        guitar.playNote();
    }
}
