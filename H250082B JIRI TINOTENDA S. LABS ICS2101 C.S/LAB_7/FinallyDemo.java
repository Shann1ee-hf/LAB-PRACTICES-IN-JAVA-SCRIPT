package LAB_7;
public class FinallyDemo {

    static int basic() {
        try {
            System.out.println("try block");
            return 1;
        } finally {
            System.out.println("finally block");
        }
    }

    // extra: what if finally changes the variable being returned?
    static int changeInFinally() {
        int x = 10;
        try {
            return x;           // the value 10 is saved here
        } finally {
            x = 20;
            System.out.println("finally changed x to " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- basic() ---");
        int r = basic();
        System.out.println("basic() returned: " + r);

        System.out.println();
        System.out.println("--- changeInFinally() ---");
        int r2 = changeInFinally();
        System.out.println("changeInFinally() returned: " + r2);
        System.out.println("""
                        When Java reaches return 1 inside try, it works out the return value and stores it, but it does not leave the method yet. 
                        Before the method can exit, Java must run the finally block, so finally block prints before the caller gets the value. 
                        This is the purpose of finally: it runs whether the try ends normally, with a return, or with an exception, so it suits clean-up work such as closing files or connections. 
                        In the second method, the value 10 was already saved when return x ran. Changing x to 20 afterwards does not affect it, so the method still returns 10. 
                        The only ways finally does not run are when the program is shut down in the try (for example System.exit(0)) or the JVM crashes.
         
              
                        """);
    }

}