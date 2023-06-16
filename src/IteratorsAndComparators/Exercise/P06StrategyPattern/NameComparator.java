package IteratorsAndComparators.Exercise.P06StrategyPattern;

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int nameLengthComparison = Integer.compare(p1.getName().length(), p2.getName().length());
        if (nameLengthComparison != 0) {
            return nameLengthComparison;
        }
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
