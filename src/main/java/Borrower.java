import java.util.ArrayList;

public class Borrower {

    private int collectionNum;
    private ArrayList<Book> books;


    public Borrower (int collectionNum) {
        this.collectionNum = collectionNum;
        this.books = new ArrayList<>();
    }

    public int collectionCount() {
        return this.collectionNum;

    }
    public void takeBook(Library library) {
        books.add(library.lendBookToBorrower());
    }
}
