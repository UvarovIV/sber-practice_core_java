package OOP_part1.Task4;

public class TestAutorAndBook {
    public static void main(String[] args) {

        Author author = new Author("Thomas Kormen", 'm', "tk@gmail.com");
        
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        System.out.println(author);

        Book book = new Book("Introduction to Algorithms", author, 1990);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book);

        author.setName("Herbert Schildt");
        author.setGender('m');
        author.setEmail("hs@gmail.com");

        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        System.out.println(author);

        Author author2 = new Author("Thomas Kormen", 'm', "tk@gmail.com");

        book.setTitle("Java: A Beginner\'s Guide");
        book.setAuthor(author2);
        book.setYear(2012);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book);

    }
}
