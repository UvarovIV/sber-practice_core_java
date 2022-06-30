package Collections_part1_and_Generics;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private Object[] arrayList;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = 10;
        arrayList = new Object[capacity];
        size = 0;
    }

    public ArrayList(ArrayList<E> aList) {
        arrayList = aList.getObj();
        capacity = aList.getCapacity();
        size = aList.size();
    }

    private Object[] getObj() {
        return arrayList;
    }

    public int getCapacity() {
        return capacity;
    }

    private Object[] increaseCapacity() {
        capacity = (capacity * 3) / 2 + 1;
        Object[] newArrayList = new Object[capacity];
        for (int i = 0; i < size; i++) 
            newArrayList[i] = arrayList[i];
        return newArrayList;
    }

    @Override
    public void add(int index, E item) {
        if (size == capacity) 
            arrayList = increaseCapacity();

        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        else if (index == size) {
            arrayList[index] = item;
            size++;
        } else {
            for (int i = size; i > index; i--)
                arrayList[i] = arrayList[i - 1];
            arrayList[index] = item;
            size++;
        }
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) 
            throw new IndexOutOfBoundsException(); 
        return (E) arrayList[index];
    }

    @Override
    public int indexOf(E item) {
        for (int i = 0; i < size; i++) 
            if (arrayList[i].equals(item))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(E item) {
        for (int i = size - 1; i >= 0; i--) 
            if (arrayList[i].equals(item))
                return i;
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) 
            throw new IndexOutOfBoundsException();
        E el = (E) arrayList[index];
        for (int i = index; i < size; i++) 
            arrayList[i] = arrayList[i + 1];
        size--;
        return el;
    }

    @Override
    public void set(int index, E item) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        else if (index == size)
            add(item);
        else 
            arrayList[index] = item;
    }

    @Override
    public ArrayList<E> subList(int from, int to) {
        if (from < 0 || to < 0 || to > size || from > to)
            throw new IndexOutOfBoundsException();
        ArrayList<E> subArrayList = new ArrayList<>();
        for (int i = from; i < to; i++) 
            subArrayList.add((E) arrayList[i]);
        return subArrayList;
    }

    @Override
    public boolean add(E item) {
        if (size < capacity)
            arrayList[size] = item;
        else {
            Object[] newArrayList = increaseCapacity();
            newArrayList[size] = item;
            arrayList = newArrayList;
        }
        size++;
        return true;
    }

    @Override
    public void clear() {
        capacity = 10;
        arrayList = new Object[capacity];
        size = 0;
    }

    @Override
    public boolean contains(E item) {
        for (Object obj : arrayList) 
            if (item.equals(obj)) 
                return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(E item) {
        int sizeCopy = size;
        for (int i = 0; i < size; i++)
            if (arrayList[i].equals(item)) {
                remove(i);
                i--;
            }
        return !(size == sizeCopy);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this);
    }

}

