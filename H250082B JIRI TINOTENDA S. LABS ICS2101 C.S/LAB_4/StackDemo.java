package LAB_4;

public class StackDemo {
    public static void main(String[] args) {

        //> Inheritance version <
        System.out.println("--- BadStack (extends ArrayList) ---");
        BadStack bad = new BadStack();
        bad.push("A");
        bad.push("B");
        bad.push("C");
        System.out.println("After pushing A, B, C: " + bad);

        bad.add(0, "X");        // allowed, but it slips an item in at the BOTTOM
        System.out.println("After bad.add(0, \"X\"): " + bad);

        System.out.println("bad.get(1) reads the middle: " + bad.get(1));

        bad.remove(1);          // allowed, but it removes from the MIDDLE
        System.out.println("After bad.remove(1): " + bad);

        bad.clear();            // allowed, empties everything in one go
        System.out.println("After bad.clear(): " + bad);

        //> Containment version <
        System.out.println();
        System.out.println("--- GoodStack (contains an ArrayList) ---");
        GoodStack good = new GoodStack();
        good.push("A");
        good.push("B");
        good.push("C");
        System.out.println("Peek: " + good.peek());
        System.out.println("Pop: " + good.pop());
        System.out.println("Pop: " + good.pop());
        System.out.println("Size now: " + good.size());

        // good.add(0, "X");    // error: GoodStack has no add method
        // good.get(0);         // error: GoodStack has no get method

        good.pop();
        try {
            good.pop();
        } catch (java.util.EmptyStackException e) {
            System.out.println("Popping an empty stack was refused");
            System.out.println("""
                    >A stack is supposed to allow access at the top only (last in, first out). 
                    Because BadStack extends ArrayList, it also inherits add(index, item), get(index), remove(index), set(...), clear(), sort(...) and many more.
                    >Any code using a BadStack can therefore insert at the bottom or remove from the middle. 
                    That breaks the LIFO rule that makes it a stack.
                    >The class can’t take these methods back. 
                    A subclass must keep everything its parent offers, so the “is-a” claim is simply wrong: a stack is not a general list.
                    >If ArrayList gains new methods in a later Java version, BadStack gains them too, without its author deciding to.
                    >GoodStack hides the ArrayList in a private field. 
                    Only push, pop, peek, isEmpty and size are visible, so the rule can’t be broken from outside. It could also change its internal storage later (for example, to a LinkedList) without breaking callers.
                    >The general guideline: use inheritance for an “is-a” relationship, and containment for “uses” or “is built from”.
                            
                            
                            """);
        }

    }
}