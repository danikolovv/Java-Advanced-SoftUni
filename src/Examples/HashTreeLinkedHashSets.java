package Examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashTreeLinkedHashSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HashSet");
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(77);
        hashSet.add(108);

        for (int set : hashSet){
            System.out.println(set);
        }

        System.out.println("TreeSet");
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(77);
        treeSet.add(108);

        for (int set : treeSet){
            System.out.println(set);
        }

        System.out.println("LinkedHashSet");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(77);
        linkedHashSet.add(108);

        for (int set : linkedHashSet){
            System.out.println(set);
        }
    }
}
