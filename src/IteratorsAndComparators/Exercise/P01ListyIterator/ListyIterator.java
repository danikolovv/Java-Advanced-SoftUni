package IteratorsAndComparators.Exercise.P01ListyIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(Collection<String> elements) {
        this.elements = new ArrayList<>(elements);
        this.currentIndex = 0;
    }

    public boolean move() {
        if (hasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return currentIndex + 1 < elements.size();
    }

    public void print() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(elements.get(currentIndex));
    }
}
