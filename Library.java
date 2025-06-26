import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book issued: " + b.title);
                    return;
                } else {
                    System.out.println("Book is already issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                b.isIssued = false;
                System.out.println("Book returned: " + b.title);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showAllBooks() {
        for (Book b : books) {
            b.displayInfo();
        }
    }
}
