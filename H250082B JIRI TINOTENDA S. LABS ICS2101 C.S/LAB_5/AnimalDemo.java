package LAB_5;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] farm = {
                new Cat("Kitty"),
                new Cow("Daisy"),
                new Duck("Donald")
        };

        for (Animal a : farm) {
            System.out.print(a.getClass().getSimpleName() + ": ");
            a.sound();
        }
    }
}