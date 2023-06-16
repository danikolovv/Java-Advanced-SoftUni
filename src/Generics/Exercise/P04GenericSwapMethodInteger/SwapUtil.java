package Generics.Exercise.P04GenericSwapMethodInteger;

import java.util.List;

public class SwapUtil {
    static <T> void swapElements(List<T> elements, int index1, int index2) {
        if (index1 < 0 || index1 >= elements.size() || index2 < 0 || index2 >= elements.size()) {
            return; // Invalid indexes, do nothing
        }

        T temp = elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, temp);
    }
}
