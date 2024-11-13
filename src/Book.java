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
}
