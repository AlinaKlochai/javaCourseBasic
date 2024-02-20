package lessons.lesson_26;

public class TV {
    private String producer;
    private double size;

    public TV(String producer, double size) {
        this.producer = producer;
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "producer='" + producer + '\'' +
                ", size=" + size +
                '}';
    }
}
