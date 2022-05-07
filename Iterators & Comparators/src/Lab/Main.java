package Lab;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*public static void main(String[] args) {

        Book bookOne = new Book("Robinson Crusoe", 1789, "Daniel Defoe");
        Book bookTwo = new Book("Lord Of the Rings", 1954, "J.R.R.Tolkien");
        Book bookThree = new Book("The Silmarillion", 1976, "J.R.R.Tolkien", "Christopher Tolkien");

        if (bookOne.compareTo(bookTwo) < 0) {
            System.out.printf("%s is before %s%n", bookOne.getTitle(), bookTwo.getTitle());
        }
        if (bookTwo.compareTo(bookThree) < 0) {
            System.out.printf("%s is before %s%n", bookTwo.getTitle(), bookThree.getTitle());
        }
    }*/
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());

        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYear());
        }
    }
}
