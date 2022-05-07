package Exercise.CustomList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private final List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public List<T> getElements() {
        return this.elements;
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        ensureNotEmpty(elements);
        return this.elements.remove(index);
    }

    public boolean contains(T element) {
        ensureNotEmpty(elements);
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        ensureNotEmpty(elements);
        T element1 = this.elements.get(firstIndex);
        T element2 = this.elements.get(secondIndex);
        this.elements.set(firstIndex, element2);
        this.elements.set(secondIndex, element1);
    }

    public int countGreaterThan(T element) {
        ensureNotEmpty(elements);
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    private static <T extends Comparable<T>> void ensureNotEmpty(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list");
        }
    }

    public T getMax() {
        ensureNotEmpty(elements);
        return this.elements.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        ensureNotEmpty(elements);
        return this.elements.stream().min(Comparable::compareTo).get();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.size();
            }

            @Override
            public T next() {
                return elements.get(index++);
            }
        };
    }
}
