import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library myLibrary;
    private Book myBook;
    private Borrower myCollection;

    @Before
    public void before(){
        myLibrary = new Library("Alexandria", 100);
        myBook = new Book ("War and Peace", "Leo Tolstoy");
        myCollection = new Borrower(25);


    }

    @Test
    public void numberOfBooksInLibrary(){
    assertEquals(100, myLibrary.bookCount());

    }

    @Test
    public void increaseBookCount(){
        assertEquals(101, myLibrary.addBook(myBook));
    }

    @Test
    public void isLibraryAtCapacity(){
        assertEquals(101, myLibrary.capacityCheck());
    }

    @Test
    public void removeFromLibraryAddToBorrowerCollection() {
        myCollection.takeBook(myLibrary);
        assertEquals(99, myLibrary.bookCount());
    }
}