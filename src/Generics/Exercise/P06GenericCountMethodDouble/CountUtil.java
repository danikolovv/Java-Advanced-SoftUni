package Generics.Exercise.P06GenericCountMethodDouble;

import java.util.List;

public class CountUtil {
    public static <T extends Comparable<T>> int countGreaterThan(List<T> elements, T value) {
        int count = 0;
        for (T element : elements) {
            if (element.compareTo(value) > 0) {
                count++;
            }
        }
        return count;
    }
}
