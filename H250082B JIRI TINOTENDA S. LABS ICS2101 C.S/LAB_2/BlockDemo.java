package LAB_2;

public class BlockDemo {

    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("Instance block 1");
    }

    static {
        System.out.println("Static block 2");
    }

    {
        System.out.println("Instance block 2");
    }

    BlockDemo() {
        System.out.println("Constructor");
    }
}