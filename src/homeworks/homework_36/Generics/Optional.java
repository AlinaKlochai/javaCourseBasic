package homeworks.homework_36.Generics;

public class Optional <T>{
    private T value;

    public Optional(T value) {
        this.value = value;
    }

    public boolean isPresent(){
        return value != null;
    }

    public T get(){
        return value;
    }
    public T orElse(T other){
        if (isPresent()){
            return value;
        }else {
            return other;
        }
    }

    public static void main(String[] args) {
        System.out.println("---------------------With integer---------------------");
        Optional<Integer> optional1 = new Optional<>(10);
        Optional<Integer> optional2 = new Optional<>(null);

        // Проверка наличия значения
        System.out.println("optional1.isPresent(): " + optional1.isPresent());
        System.out.println("optional2.isPresent(): " + optional2.isPresent());

        // Получение значения
        System.out.println("optional1.get(): " + optional1.get());
        System.out.println("optional2.get(): " + optional2.get());

        // Получение значения или альтернативного значения
        System.out.println("optional1.orElse(0): " + optional1.orElse(0));
        System.out.println("optional2.orElse(0): " + optional2.orElse(0));

        System.out.println("---------------------With string---------------------");
        Optional<String> optional3 = new Optional<>("Cat");
        Optional<String> optional4 = new Optional<>(null);

        // Проверка наличия значения
        System.out.println("optional1.isPresent(): " + optional3.isPresent());
        System.out.println("optional2.isPresent(): " + optional4.isPresent());

        // Получение значения
        System.out.println("optional1.get(): " + optional3.get());
        System.out.println("optional2.get(): " + optional4.get());

        // Получение значения или альтернативного значения
        System.out.println("optional3.orElse: " + optional3.orElse("Other Value"));
        System.out.println("optional4.orElse: " + optional4.orElse("Other Value"));
    }
}
