package Collections_part1;

import java.util.*;

public class ArrayListIterator implements Iterator<Object> {
    
    private ArrayList arrayList;
    private int index;

    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arrayList.size();
    }

    @Override
    public Object next() throws NoSuchElementException {
        if (!hasNext())
			throw new NoSuchElementException();
        Object obj = arrayList.get(index);
        index++;
        return obj;
    }
}
