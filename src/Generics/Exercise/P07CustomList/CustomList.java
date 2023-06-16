package Generics.Exercise.P07CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T remove(int index) {
        return elements.remove(index);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(elements, index1, index2);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T currentElement : elements) {
            if (currentElement.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.max(elements);
    }

    public T getMin() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.min(elements);
    }

    public void print() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
