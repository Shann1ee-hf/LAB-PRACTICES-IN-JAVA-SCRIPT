package LAB_7;

public class ArrayAccessDemo {

    // returns the element, or -1 if the index does not exist
    static int getElement(int[] data, int index) {
        try {
            return data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + index + " is not valid. " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {55, 62, 78, 90};

        System.out.println("Element at 2: " + getElement(marks, 2));
        System.out.println("Element at 4: " + getElement(marks, 4));
        System.out.println("Element at -1: " + getElement(marks, -1));
    }
}