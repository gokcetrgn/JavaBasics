package StreamLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book1", 125, "Author1", "1920");
        Book bookTwo = new Book("Book2", 60, "Author1", "1920");
        Book bookThree = new Book("Book3", 70, "Author1", "1920");
        Book bookFour = new Book("Book4", 270, "Author1", "1920");
        Book bookFive = new Book("Book5", 370, "Author1", "1920");

        ArrayList<Book> books = new ArrayList<>();

        books.add(book);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookFour);
        books.add(bookFive);

        Map<String, String> nameAauthor = new HashMap<String, String>();

        books.stream().forEach(bookS -> nameAauthor.put(bookS.getBookName(), bookS.getAuthor()));

        ArrayList<Book> newBooks = new ArrayList<>();

        books.stream().filter(pageNumber -> pageNumber.getPageNumber() > 100).forEach(bookS -> newBooks.add(bookS));

        newBooks.forEach(bookList -> System.out.println(bookList.getBookName()));

        for(String name: nameAauthor.keySet()){
            System.out.println(name + " - "+ nameAauthor.get(name));
        }
        System.out.println();

    }
}
