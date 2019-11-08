package p01iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"))
                .appendBook(new Book("Bible"))
                .appendBook(new Book("Cinderella"))
                .appendBook(new Book("Daddy-Long-Legs"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext())
            System.out.println(((Book)iterator.next()).getName());
    }
}
