package ejercicio4;
import java.util.Arrays;
import java.util.Iterator;

class CollectionCustom<T> {
    
   	int cantidad = 3;
	
    private Object[] elements;
    private int size;

    public CollectionCustom() {
        this.elements = new Object[cantidad];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }
    public void addFirst(T element) {
        ensureCapacity();
        System.arraycopy(elements, 0, elements, 1, size);
        elements[0] = element;
        size++;
    }
    public void addLast(T element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[--size] = null;
                return;
            }
        }
    }
    public void removeAll(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[size - 1] = null;
                size--;
                i--;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }
    
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return (T) elements[currentIndex++];
            }
        };
    }
    
    
    
    
}