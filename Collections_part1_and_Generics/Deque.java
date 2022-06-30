package Collections_part1_and_Generics;

public interface Deque<E> extends Collection<E> {

    void addFirst(E item);

    void addLast(E item);

    E getFirst();

    E getLast();

    E pollFirst();

    E pollLast();

    E removeFirst();

    E removeLast();
}
