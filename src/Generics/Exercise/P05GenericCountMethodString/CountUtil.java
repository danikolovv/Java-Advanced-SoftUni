package Generics.Exercise.P05GenericCountMethodString;

import java.util.List;

public class CountUtil {
    static <T extends Comparable<T>> int countGreaterThan(List<T> elements, T value) {
        int count = 0;
        for (T element : elements) {
            if (element.compareTo(value) > 0) {
                count++;
            }
        }
        return count;
    }
}
