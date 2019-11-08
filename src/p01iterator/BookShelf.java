package p01iterator;

public class BookShelf implements Aggregate<Book> {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public BookShelf appendBook(Book book) {
        this.books[last] = book;
        last++;
        return this;
    }
    @Override
    public int getLength() {
        return last;
    }
    @Override
    public Book get(int index) {
        return getBookAt(index);
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
