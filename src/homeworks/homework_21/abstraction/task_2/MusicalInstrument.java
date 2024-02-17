package homeworks.homework_21.abstraction.task_2;

abstract class MusicalInstrument {
    private String nameOfMusicalInstrument;

    abstract void playNote();

    public MusicalInstrument(String nameOfMusicalInstrument) {
        this.nameOfMusicalInstrument = nameOfMusicalInstrument;
    }

    public String getNameOfMusicalInstrument() {
        return nameOfMusicalInstrument;
    }
}
