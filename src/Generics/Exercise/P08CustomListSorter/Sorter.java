package Generics.Exercise.P08CustomListSorter;

class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        customList.sort();
    }
}