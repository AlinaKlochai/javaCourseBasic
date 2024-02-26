package homeworks.homework_30.task_2.var_1_Enum;

public class Suitcase implements Comparable<Suitcase> {
    private Materials material;
    private Sizes size;
    private Colors color;

    public Suitcase(Materials material, Sizes size, Colors color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public Materials getMaterial() {
        return material;
    }

    public Sizes getSize() {
        return size;
    }

    public Colors getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase [" +
                "Material: " + material + ", Size: " + size + ", Color: " + color + "]";
    }

    public int compareTo(Suitcase anotherSuitcase){
        int result = size.compareTo(anotherSuitcase.getSize());
        if (result == 0) {
            result = material.compareTo(anotherSuitcase.material);
        }

        if (result == 0) {
            result = getColor().compareTo(anotherSuitcase.getColor());
        }

        return result;
    }
}
