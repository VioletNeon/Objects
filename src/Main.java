public class Main {
    public static void main(String[] args) {
        Author authorOfBookOnMicroservices = new Author("Chris", "Richardson");
        Author authorOfBookOnMicroservicesDouble = new Author("Chris", "Richardson");
        Author authorOfBookOnAPIDesignPatterns = new Author("JJ", "Geewax");

        System.out.println(authorOfBookOnMicroservices.equals(authorOfBookOnMicroservicesDouble));
        System.out.println(authorOfBookOnMicroservices.equals(authorOfBookOnAPIDesignPatterns));

        Book bookOnMicroservices = new Book("Microservices", authorOfBookOnMicroservices, 2019);
        Book bookOnMicroservicesDouble = new Book("Microservices", authorOfBookOnMicroservices, 2019);
        Book bookOnAPIDesignPatterns = new Book("API Design Patterns", authorOfBookOnAPIDesignPatterns, 2020);

        System.out.println(bookOnMicroservices.equals(bookOnMicroservicesDouble));
        System.out.println(bookOnMicroservices.equals(bookOnAPIDesignPatterns));

        System.out.println(authorOfBookOnMicroservices);
        System.out.println(authorOfBookOnAPIDesignPatterns);

        System.out.println(bookOnMicroservices);
        System.out.println(bookOnAPIDesignPatterns);
    }
}