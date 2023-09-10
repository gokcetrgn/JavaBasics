package Collections;

public class Book implements Comparable<Book> {

    private String bookName;
    private int pageNumber;
    private String authorName;
    private int publishDate;

    public Book(){
        
    }
    public Book(String bookName, int pageNumber, String authorName, int publishDate){
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book object) {
        return getBookName().compareTo(object.getBookName());
    }

    
}
