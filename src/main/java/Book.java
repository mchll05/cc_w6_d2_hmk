import java.util.HashMap;

public class Book {

    private String title;
    private String author;
    private HashMap<Genre, Integer> genreCount;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        HashMap<Genre, Integer> genreCount = new HashMap<>();
        genreCount.put(Genre.FICTION, 10);
        genreCount.put(Genre.CLASSIC, 20);
        genreCount.put(Genre.FANTASY, 30);

        System.out.println(genreCount.get(Genre.FANTASY) + " travel through magical lands");
    }


}
