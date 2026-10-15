package LAB_9;

import java.util.HashSet;
import java.util.Set;

public class BookDemo {
    public static void main(String[] args) {

        System.out.println(">Book (with equals and hashCode)<");
        Set<Book> shelf = new HashSet<>();
        System.out.println("Add first copy: " + shelf.add(new Book("978-0134685991", "Effective Java")));
        System.out.println("Add same ISBN:  " + shelf.add(new Book("978-0134685991", "Effective Java (2nd copy)")));
        System.out.println("Add new ISBN:   " + shelf.add(new Book("978-0596009205", "Head First Java")));
        System.out.println("Set size: " + shelf.size());

        System.out.println();
        System.out.println(">PlainBook (without them)<");
        Set<PlainBook> plainShelf = new HashSet<>();
        plainShelf.add(new PlainBook("978-0134685991", "Effective Java"));
        plainShelf.add(new PlainBook("978-0134685991", "Effective Java"));
        System.out.println("Set size: " + plainShelf.size());
    }
}