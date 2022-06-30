package Collections_part2_and_Generics;

import Collections_part1_and_Generics.ArrayList;
import Collections_part1_and_Generics.Collection;
import Collections_part1_and_Generics.LinkedList;

public class HashMap<K, V> implements Map<K, V> {

    private LinkedList<Entry<K, V>>[] buckets;
    private int capacity;
    private int size;

    public HashMap() {
        capacity = (int) Math.pow(2, 25);
        size = 0;
        buckets = new LinkedList[capacity];
    }

    private K getKey(LinkedList<Entry<K, V>> linkedList, int i) {
       return ((Entry<K, V>) linkedList.get(i)).getKey();
    }

    private V getValue(LinkedList<Entry<K, V>> linkedList, int i) {
        return ((Entry<K, V>) linkedList.get(i)).getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
        buckets = new LinkedList[capacity];
    }

    @Override
    public boolean containsKey(K key) {
        for (LinkedList<Entry<K, V>> linkedList : buckets)
            if (linkedList != null)
                for (int i = 0; i < linkedList.size(); i++)
                    if (getKey(linkedList, i).equals(key))
                        return true;
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for (var linkedList : buckets) {
            if (linkedList != null) {
                for (int i = 0; i < linkedList.size(); i++) {
                    
                    V buff = getValue(linkedList, i);

                    if (buff == null && value == null)
                        return true;
                    else if (buff == null)
                        continue;
                    else if (buff.equals(value))
                        return true;

                }
            }
        }
        return false;
    }

    @Override
    public V get(K key) {
        int bucketNumber = Math.abs(key.hashCode() % buckets.length);
        var linkedList = buckets[bucketNumber];
        for (int i = 0; i < linkedList.size(); i++)
            if (getKey(linkedList, i).equals(key)) 
                return getValue(linkedList, i);
        return null;
    }

    @Override
    public Entry<K, V> put(K key, V value) {
        int bucketNumber =  Math.abs(key.hashCode() % buckets.length);
        var linkedList = buckets[bucketNumber];
        if (linkedList != null) {
            for (int i = 0; i < linkedList.size(); i++)
                if (getKey(linkedList, i).equals(key)) {
                    ((Entry<K, V>) linkedList.get(i)).setValue(value);
                    return new Entry<>(key, value);
                }
        } else {
            linkedList = new LinkedList<Entry<K, V>>();
        }
        linkedList.addLast(new Entry<>(key, value));
        buckets[bucketNumber] = linkedList;
        size++;
        return new Entry<>(key, value);
    }

    @Override
    public V remove(K key) {
        for (var linkedList : buckets) 
            if (linkedList != null) 
                for (int i = 0; i < linkedList.size(); i++) 
                    if (getKey(linkedList, i).equals(key)) {
                        size--;
                        return ((Entry<K, V>) linkedList.remove(i)).getValue();
                    }
        return null;
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> vals = new ArrayList<>();
        for (var linkedList : buckets)
            if (linkedList != null)
                for (int i = 0; i < linkedList.size(); i++)
                    vals.add(getValue(linkedList, i));
        return vals;
    }

    @Override
    public Collection<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();
        for (var linkedList : buckets)
            if (linkedList != null)
                for (int i = 0; i < linkedList.size(); i++)
                    keys.add(getKey(linkedList, i));
        return keys;
    }

    @Override
    public Collection<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> entry = new ArrayList<>();
        for (var linkedList : buckets)
            if (linkedList != null) 
                for (int i = 0; i < linkedList.size(); i++) 
                    entry.add(linkedList.get(i));
        return entry;
    }
}