package homeworks.homework_34;

public class Element {
    private String nameOfProduct;

    public Element(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public String toString() {
        return "Element{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                '}';
    }
}
