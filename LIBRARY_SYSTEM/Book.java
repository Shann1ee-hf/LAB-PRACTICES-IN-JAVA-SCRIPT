package LIBRARY_SYSTEM;
public class Book extends LibraryItem {
    private String author;

    Book(String id, String title, String author) {
        super(id, title);
        this.author = Check.text(author, "Author");
    }

    @Override
    int loanPeriodDays() {
        return 14;
    }

    @Override
    String toCsv() {
        return "BOOK," + getId() + "," + getTitle() + "," + author;
    }

    @Override
    public String toString() {
        return "Book | " + super.toString() + " | by " + author;
    }
}
