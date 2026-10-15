package LAB_5;
public class PrinterDemo {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(42);
        p.print(3.14);
        p.print("Hello Lab 5");
        p.print(new int[]{1, 2, 3, 4});

        // extra test: there is no print(char), so Java picks the closest match
        p.print('A');
    }
}