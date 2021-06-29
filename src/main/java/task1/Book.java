package task1;

import java.util.Objects;

public class Book implements Printable {

    private String bookName;

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "task1.Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("task1.Book name is: " + getBookName());
    }
}
