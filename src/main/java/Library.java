import java.util.ArrayList;

public class Library {

    private String name;
    private int bookNum;
    private ArrayList<Book> books;

    public Library(String name, int bookNum) {
        this.name = name;
        this.bookNum = bookNum;
        this.books = new ArrayList<>();
    }

        public int bookCount() {
            return this.bookNum;
        }

        public int addBook(Book book) {
            this.books.add(book);
            return this.bookNum += 1;

        }

        public int capacityCheck() {
            int capacity = 200;
            if (this.bookNum <= capacity);
            return this.bookNum += 1;
        }

        public Book lendBookToBorrower() {
            bookNum -= 1;
            return this.books.remove(0);
        }

}

