public class Main {
    public static void main(String[] args) {
        Author authorOfBookOnMicroservices = new Author("Chris", "Richardson");
        Author authorOfBookOnAPIDesignPatterns = new Author("JJ", "Geewax");

        Book bookOnMicroservices = new Book("Microservices", authorOfBookOnMicroservices, 2019);
        Book bookOnAPIDesignPatterns = new Book("API Design Patterns", authorOfBookOnAPIDesignPatterns, 2020);

        System.out.println(authorOfBookOnMicroservices.getFirstName() + " " + authorOfBookOnMicroservices.getLastName());
        System.out.println(authorOfBookOnAPIDesignPatterns.getFirstName() + " " + authorOfBookOnAPIDesignPatterns.getLastName());

        System.out.println(bookOnAPIDesignPatterns.getName() + " " + bookOnAPIDesignPatterns.getAuthor().getFirstName() + " " + bookOnAPIDesignPatterns.getAuthor().getLastName() + " " + bookOnAPIDesignPatterns.getYearOfPublication());

        bookOnAPIDesignPatterns.setYearOfPublication(2021);

        System.out.println(bookOnMicroservices.getName() + " " + bookOnMicroservices.getAuthor().getFirstName() + " " + bookOnMicroservices.getAuthor().getLastName() + " " + bookOnMicroservices.getYearOfPublication());
        System.out.println(bookOnAPIDesignPatterns.getName() + " " + bookOnAPIDesignPatterns.getAuthor().getFirstName() + " " + bookOnAPIDesignPatterns.getAuthor().getLastName() + " " + bookOnAPIDesignPatterns.getYearOfPublication());
    }
}