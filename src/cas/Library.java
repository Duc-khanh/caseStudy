package cas;

public class Library {

    int size = 0;
    Ebook[] arrayEBook = new Ebook[size];



//    thêm

    public Ebook[] addAList(Ebook ebook) {
//tạo 1 mảng mới có độ dài lớn hơn mảng cũ 1 đơn vị
        Ebook[] newArrayEbook = new Ebook[arrayEBook.length + 1];
//       duyệt mảng cũ để thêm giá trị
        for (int i = 0; i < arrayEBook.length; i++) {
//            gán giá trị đầu tiên của mảng cũ sang mảng mới.
            newArrayEbook[i] = arrayEBook[i];
        }
//        cho mảng cũ bằng mảng mới để có độ dài mảng bằng nhau
        arrayEBook = newArrayEbook;
//        gán giá trị vào vị trí đầu tiên của mảng cũ.
        arrayEBook[size++] = ebook;
//        trả về mảng cũ.
        return arrayEBook;
    }


    //    sửa
    public Ebook[] update(int maSach, String title, String author, int publishYear, String genre, double size, String format) {
        // duyet mang
        for (int i = 0; i < arrayEBook.length; i++) {
            // kiem tra ma sach
            if (arrayEBook[i].getBookCode() == maSach) {
                // sua cac giá trị
                arrayEBook[i].setTitle(title);
                arrayEBook[i].setAuthor(author);
                arrayEBook[i].setPublishYear(publishYear);
                arrayEBook[i].setGenre(genre);
                arrayEBook[i].setSize(size);
                arrayEBook[i].setFormat(format);
            }
        }
    return arrayEBook;
    }
// xoa

    public Ebook[] delete(int maSach) {
        int dem = 0;
        for (int i = 0; i < arrayEBook.length; i++) {
            // ktr nếu ID không trùng với maSach
            if (arrayEBook[i].getBookCode() != maSach) {
                // thì dem tăng lên và ktr tiếp
                dem++;
            }

        }
        Ebook[] newArrayEBook = new Ebook[dem];
        int index = 0;
        for (int i = 0; i < arrayEBook.length; i++) {
            if (arrayEBook[i].getBookCode() != maSach) {
                newArrayEBook[index++] = arrayEBook[i];
            }
            else {
                System.out.println(" ID không có ở thư viện mời bạn nhập lại" );
            }
        }
        arrayEBook = newArrayEBook;
        return arrayEBook;
    }

    public void searchByID(int maSach) {
        // duyệt mảng
        for (int i = 0; i < arrayEBook.length; i++) {
            // kiểm tra nếu ID = maSAch
            if (arrayEBook[i].getBookCode() == maSach) {
                // thì in ra màn hình
                System.out.println(arrayEBook[i]);
            } else {
                System.out.println(" ID không có ở thư viện mời bạn nhập lại" );
            }
        }

    }

    public void searchByTitle(String title) {
        for (int i = 0; i < arrayEBook.length; i++) {
            if (arrayEBook[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(arrayEBook[i]);
            }
            else {
                System.out.println(" Tiêu đề không có ở thư viện mời bạn nhập lại" );
            }
        }

    }

    public void show() {
        for (Ebook i : arrayEBook) {

            System.out.println(i);
        }
    }
}



