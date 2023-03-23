package org.example;


import java.util.Comparator;

/**
 * This is a class that implements the Comparator class.
 */
class FirstComparator implements Comparator<Person> {
    /**
     * This is a method that override the compare method.
     *
     * @param e1 – the first object to be compared;
     * @param e2 – the second object to be compared;
     */
    @Override
    public int compare(Person e1, Person e2) {

        return (e1.name).compareTo(e2.name);
    }
}

