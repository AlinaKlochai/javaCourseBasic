package homeworks.homework_21.inheritance.abstraction.task_2;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {
        Violin violin = new Violin("Violin Ocean");
        Piano piano = new Piano("Piano");
        Guitar guitar = new Guitar("Guitar");

        String name1 = violin.getNameOfMusicalInstrument();
        System.out.println(name1);
        violin.playNote();

        String name2 = piano.getNameOfMusicalInstrument();
        System.out.println(name2);
        piano.playNote();

        String name3 = guitar.getNameOfMusicalInstrument();
        System.out.println(name3);
        guitar.playNote();
    }
}
