import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object entity) {
        if (this == entity) return true;
        if (entity == null || this.getClass() != entity.getClass()) {
            return false;
        }

        Author author = (Author) entity;
        boolean isFirstNameEqual = this.firstName.equals(author.firstName);
        boolean isLastNameEqual = this.lastName.equals(author.lastName);

        return isFirstNameEqual && isLastNameEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }
}
