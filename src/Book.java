import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        if (yearOfPublication <= 0) {
            throw new IllegalArgumentException("Год публикации должен быть положительным целым числом.");
        }

        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return this.name + " " + this.author.toString() + " " + this.yearOfPublication;
    }

    @Override
    public boolean equals(Object entity) {
        if (this == entity) return true;
        if (entity == null || this.getClass() != entity.getClass()) return false;

        Book book = (Book) entity;
        boolean isYearOfPublicationEqual = this.yearOfPublication == book.yearOfPublication;
        boolean isNameEqual = this.name.equals(book.name);
        boolean isAuthorEqual = this.author.equals(book.author);

        return isYearOfPublicationEqual && isNameEqual && isAuthorEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublication);
    }
}
