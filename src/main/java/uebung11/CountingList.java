package uebung11;

public interface CountingList<E> {
    int count(E element);
    int getCount();
    int unique();
}