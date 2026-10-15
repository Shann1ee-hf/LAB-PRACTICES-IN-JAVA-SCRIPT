package LAB_6;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rectangle(4, 6), new Square(5)};

        for (Shape s : shapes) {
            System.out.printf("%s > area: %.2f, perimeter: %.2f%n",
                    s.getClass().getSimpleName(), s.area(), s.perimeter());
        }

        // Shape s = new Shape();   // error: Shape is abstract
    }
}