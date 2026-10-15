package LAB_4;

public class DogDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.bark();

        System.out.println("""
                Every subclass constructor must call a superclass constructor as its first action.
                If the programmer writes no constructor, Java quietly creates a default one that starts with an invisible super();. 
                That call has no arguments. Animal only has Animal(String name), so when it defines any constructor, Java no longer creates a no-argument one for it. 
                The invisible super(); in Dog has nothing to match, and the compiler reports an error. 
                The fix is to write a Dog constructor and call super(name) explicitly. 
                The other fix is to add a no-argument constructor to Animal, but that would allow animals without names, so passing the name up is the better design.
                
                
                """);
    }
}