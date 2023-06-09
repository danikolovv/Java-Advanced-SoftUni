package Generics.Exercise.P01GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return data.getClass().getName() + ": " + data.toString();
    }
}