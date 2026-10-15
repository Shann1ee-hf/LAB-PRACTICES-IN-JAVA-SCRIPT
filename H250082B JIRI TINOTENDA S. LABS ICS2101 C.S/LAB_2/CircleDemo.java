package LAB_2;

public class CircleDemo {
    public static void main(String[] args) {

        // Task 1:
        System.out.println(" Task 1: Constructors");
        Circle a = new Circle(2.5);
        Circle b = new Circle();

        System.out.println("Circle a radius: " + a.radius);
        System.out.printf("Circle a area: %.2f%n", a.area());
        System.out.println("Circle b radius: " + b.radius);
        System.out.printf("Circle b area: %.2f%n", b.area());

        //Task 2:
        System.out.println();
        System.out.println("Task 2: Static counter");
        System.out.println("Circles before creating c: " + Circle.getCount());

        Circle c = new Circle(4);

        System.out.println("Circles after creating c: " + Circle.getCount());
        System.out.println("Radius of c: " + c.radius);
    }
}