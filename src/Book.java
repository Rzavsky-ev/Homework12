public class Book {
    public Book(Author author, String bookTitle, int yearPublication) {
        this.bookTitle = bookTitle;
        this.yearPublication = yearPublication;
        authorBook = author;
    }

    private Author authorBook;
    private String bookTitle;
    private int yearPublication;

    public Author getNameAuthor() {
        return authorBook;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int year) {
        yearPublication = year;
    }
}
