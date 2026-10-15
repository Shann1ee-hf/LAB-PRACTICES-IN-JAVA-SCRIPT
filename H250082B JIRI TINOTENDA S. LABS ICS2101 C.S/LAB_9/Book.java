package LAB_9;

public class Book {
    String isbn;
    String title;

    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    // two books are equal when their ISBN is equal
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book other)) {
            return false;
        }
        return isbn.equals(other.isbn);
    }

    // must use the same field as equals
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return title + " (" + isbn + ")";
    }
}
