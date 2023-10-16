package ejercicio4;

import java.util.Arrays;
import java.util.Iterator;

public class prueba<T> implements Iterable<T> {
	int cantidad = 3;
	
    private Object[] elements;
    private int size;

    public prueba() {
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

    public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                T removedElement = (T) elements[i];
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[size - 1] = null;
                size--;
                return removedElement;
            }
        }
        return null;
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

    @Override
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

    // Main method for testing
    public static void main(String[] args) {
        prueba<Persona> personas = new prueba<>();

        personas.add(new Persona("Abi", 22));
        personas.addLast(new Persona("Meli", 29));
        personas.add(new Persona("Tito", 44));
        
        System.out.println("Size: " + personas.size());

        personas.remove(new Persona("Tito", 44));

        System.out.println("Tamaño antes de sacar a la ultima persona: " + personas.size());

        System.out.println("La colección está vacía? " + personas.isEmpty());
        
        System.out.println("---------------------------");
       
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}

