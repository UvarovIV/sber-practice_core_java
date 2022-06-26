package Collections_part1;

import java.util.Spliterator;
import java.util.function.*;;

public interface Collection extends Iterable<Object> {
    
    int size();

    boolean isEmpty();

    boolean contains(Object item);

    boolean add(Object item);

    boolean remove(Object item);

    void clear();

    @Override
    default void forEach(Consumer<? super Object> action) {
        Iterable.super.forEach(action);
    }

    @Override
    default Spliterator<Object> spliterator() {
        return Iterable.super.spliterator();
    }
}
