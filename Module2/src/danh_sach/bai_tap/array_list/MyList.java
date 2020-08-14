package danh_sach.bai_tap.array_list;

import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
        
    }
    public void add(int index, E element) {
  
        if (size == elements.length) {
            ensureCapacity(5);
        }
        if (size - index >= 0) System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }
    public E remove(int index) {
        checkIndex(index);
        E element = (E)elements[index];
        if (size - 1 - index >= 0) System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        elements[size - 1] = null;
        size--;
        return element;
    }
    
    public int size() {
        return this.size;
    }
    
    @Override
    public E clone() {
        size = size / 2;
        return (E) elements;
    }
    
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }
    
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean add(E element) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length + 1);
        }
        elements[size] = element;
        size++;
        return true;
    }
    
    public void ensureCapacity(int minCapacity) {
        if (elements.length < minCapacity) {
            elements = Arrays.copyOf(elements, elements.length + minCapacity);
        }
    }
    
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }
    
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }
}
