package Collections;

import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {   

        Set<Book> library = new TreeSet<>();

        // önce hashset kullandım ama istediğim gibi sıralamam mümkün olmadı

        library.add(new Book("Vahsetin Cagrisi", 80, "Jack London", 1900));
        library.add(new Book("Kumarbaz", 200, "Dostoyevski", 1800));
        library.add(new Book("Anna Karenina", 864, "Tolstoy", 1877));
        library.add(new Book("Köpek Kalbi", 200, "Bulgakov", 1925));
        library.add(new Book("Ölü Canlar", 484, "Gogol", 1842));

        for (Book bookName : library) {
            System.out.println("Kitap adi" + bookName.getBookName() +
                    "\nSayfa sayisi: " + bookName.getPageNumber() +
                    "\nYazari: " + bookName.getAuthorName() +
                    "\nYayinlanma tarihi: " + bookName.getPublishDate());
            System.out.println("********************************");
        }
    }
}