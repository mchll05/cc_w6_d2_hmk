import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower myCollection;

    @Before
    public void before() {
        myCollection = new Borrower(25);
    }

    @Test
    public void numberOfBooksInCollection() {
        assertEquals(25, myCollection.collectionCount());
    }

}