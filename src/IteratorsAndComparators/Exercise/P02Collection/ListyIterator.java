package IteratorsAndComparators.Exercise.P02Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class ListyIterator implements Iterable<String> {
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

    public void printAll() {
        for (String element : this) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new ListyIteratorIterator();
    }

    private class ListyIteratorIterator implements Iterator<String> {
        private int iteratorIndex;

        public ListyIteratorIterator() {
            this.iteratorIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return iteratorIndex < elements.size();
        }

        @Override
        public String next() {
            return elements.get(iteratorIndex++);
        }
    }
}
