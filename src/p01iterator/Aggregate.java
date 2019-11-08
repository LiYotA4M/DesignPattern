package p01iterator;

public interface Aggregate<T> {

    Iterator iterator();
    int getLength();
    T get(int index);
}
