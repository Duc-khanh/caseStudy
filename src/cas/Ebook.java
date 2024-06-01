package cas;

public class Ebook extends Book {
    private double size;
    private String Format;


    public Ebook(int bookCode, String title, String author, int publishYear, String genre, double size, String format) {
        super(bookCode, title, author, publishYear, genre);
        this.size = size;
        Format = format;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "size=" + size +
                ", Format='" + Format + '\'' +
                ", bookCode=" + bookCode +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
