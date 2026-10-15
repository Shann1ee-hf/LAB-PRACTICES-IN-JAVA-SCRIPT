package LAB_1;
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle[] list = new Rectangle[5];
        list[0] = new Rectangle(3, 4);
        list[1] = new Rectangle(5, 5);
        list[2] = new Rectangle(2, 9);
        list[3] = new Rectangle(7, 2.5);
        list[4] = new Rectangle(6, 4.5);

        // start by assuming the first one is the biggest
        Rectangle biggest = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].area() > biggest.area()) {
                biggest = list[i];
            }
        }

        System.out.println("Rectangle with the largest area:");
        System.out.println("Width: " + biggest.width + ", Height: " + biggest.height);
        System.out.println("Area: " + biggest.area());
        System.out.println("Perimeter: " + biggest.perimeter());
    }
}

