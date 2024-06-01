package cas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do {
            System.out.println();
            System.out.println("1.Xem danh sách của thư viện.");

            System.out.println("2.Thêm sách điện tử mới vào thư viện.");
            System.out.println("3.Cập nhật thông tin của một sách điện tử dựa trên mã sách.");
            System.out.println("4.Xóa một sách điện tử dựa trên mã sách.");
            System.out.println("5.Tìm kiếm sách điện tử dựa trên mã sách.");
            System.out.println("6.Tìm kiếm sách điện tử dựa trên tiêu đề sách .");
            System.out.println("7. exit.");
            choice = scanner.nextInt();


        switch (choice) {
            case 1:
                library.show();
                break;

            case 2:
                System.out.println("id");
                int id = scanner.nextInt();
                System.out.println("nhập tiêu đề sách");
                String title = scanner.next();
                System.out.println("Nhập tên tác gia");
                String author = scanner.next();
                System.out.println("Nhập năm xuất bản");
                int publishYear = scanner.nextInt();
                System.out.println("Nhập thể loại");
                String genre = scanner.next();
                System.out.println("Nhập kích thước tệp ");
                double size = scanner.nextDouble();
                System.out.println("Nhập định dạng tệp");
                String format = scanner.next();
                Ebook ebook = new Ebook(id, title, author, publishYear, genre, size, format);
                library.addAList(ebook);
             //   library.show();
                break;

            case 3:
                System.out.println("id");
                int newid = scanner.nextInt();
                System.out.println("nhập tiêu đề sách");
                String newtitle = scanner.next();
                System.out.println("Nhập tên tác gia");
                String newauthor = scanner.next();
                System.out.println("Nhập năm xuất bản");
                int newpublishYear = scanner.nextInt();
                System.out.println("Nhập thể loại");
                String newgenre = scanner.next();
                System.out.println("Nhập kích thước tệp ");
                double newsize = scanner.nextDouble();
                System.out.println("Nhập định dạng tệp");
                String newformat = scanner.next();
                library.update(newid, newtitle, newauthor, newpublishYear, newgenre, newsize, newformat);
//                library.show();
                break;
            case 4:
                System.out.println("Nhập mã để xóa.");
                int id1 = scanner.nextInt();
                library.delete(id1);
//                library.show();
                break;
            case 5:
                System.out.println("Nhập mã để tìm sách");
                int id2 = scanner.nextInt();
                library.searchByID(id2);
//               library.show();
                break;
            case 6:
                System.out.println("Nhập để tiêu đề để tìm sách");
                String Title = scanner.next();
               library.searchByTitle(Title);
//                System.out.println(Title);;
                break;



            default:
                System.out.println("khong có ở menu thư viện");
        }
        }
        while (choice != 7);
    }
}
