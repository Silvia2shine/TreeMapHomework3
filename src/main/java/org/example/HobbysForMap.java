package org.example;

/**
 * This is a class that contains 3 methods.
 *
 * @param : - nameOfHobbiesForMap - the name of the hobby's, used to create the MAp;
 */
public class HobbysForMap {
    String nameOfHobbiesForMap;

    /**
     * This is the constructor of the class HobbysForMap.
     *
     * @param : - name - the name of the hobby's;
     */
    HobbysForMap(String name) {
        this.nameOfHobbiesForMap = name;

    }
    /**
     * This is a public method that get the name of the hobby's. ;
     * @return nameOfHobbiesForMap;
     */
    public String getName() {
        return nameOfHobbiesForMap;

    }
    /**
     * This is a  method that override the String.
     *  @return nameOfHobbiesForMap;
     */
    @Override
    public String toString() {
        return "Hobbys {" +
                "name='" + nameOfHobbiesForMap + '\'' +
                '}';
    }
}