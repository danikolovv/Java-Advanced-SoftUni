package Generics.Exercise.P04GenericSwapMethodInteger;

import java.util.List;

public class PrintUtil {
    static <T> void printElements(List<T> elements) {
        for (T element : elements) {
            System.out.println(element.getClass().getName() + ": " + element.toString());
        }
    }
}
