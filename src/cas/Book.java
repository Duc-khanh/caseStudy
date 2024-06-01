package cas;

public class Book {
    protected int bookCode;
    protected String title;
    protected String author;
    protected int publishYear;
    protected String genre;


    public Book(){

    }



    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }



    public Book(int bookCode, String title, String author, int publishYear, String genre){
        this.bookCode= bookCode;
        this.title= title;
        this.author=author;
        this.publishYear= publishYear;
        this.genre= genre;
    }
    @Override
    public String toString() {
        return "book{" +
                "bookCode=" + bookCode +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
