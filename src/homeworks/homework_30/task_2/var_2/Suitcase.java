package homeworks.homework_30.task_2.var_2;

public class Suitcase {
    private String material;
    private String size;
    private String color;

    public Suitcase(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase [" +
                "Material: " + material + ", Size: " + size + ", Color: " + color + "]";
    }
}
