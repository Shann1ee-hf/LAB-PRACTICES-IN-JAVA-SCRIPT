package LAB_2;

public class Circle {
    double radius;

    //Task 2: static counter, shared by every Circle.
    private static int count = 0;

    // Task 1: constructor that takes a radius.
    Circle(double radius) {
        this.radius = radius;
        count++;                // Task 2: one more circle exists
    }

    // Task 1: no-argument constructor, radius defaults to 1.0.
    Circle() {
        this.radius = 1.0;
        count++;                // Task 2: one more circle exists
    }

    double area() {
        return Math.PI * radius * radius;
    }

    //Task 2: static getter
    static int getCount() {
        return count;
    }
}