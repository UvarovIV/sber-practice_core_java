package Collections_part2_and_Generics;

import Collections_part1_and_Generics.Collection;

public interface Map<K, V> {
    int size();

    boolean isEmpty();

    boolean containsKey(K key);

    boolean containsValue(V value);

    V get(K key);

    Object put(K key, V value);

    V remove(K key);

    void clear();

    Collection<V> values();

    Collection<K> keySet();

    Collection<Entry<K, V>> entrySet();
}