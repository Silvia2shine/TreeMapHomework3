package org.example;
/**
 * This is a class that contains 3 methods.
 *
 * @param : - nameOfCountries - the name of the countries;
 */
public class Countries {

    String nameOfCountries;

    /**
     * This is the constructor of the class Countries.
     *
     * @param : - name - the name of the countries;
     */
    Countries(String name) {
        this.nameOfCountries = name;

    }
    /**
     * This is a public method that get the name of the countries ;
     * @return nameOfCountrsie;
     */
    public String getName() {

        return nameOfCountries;
    }
    /**
     * This is a  method that override the String.
     *  @return nameOfCountrsie;
     */
    @Override
    public String toString() {
        return "Countries{" +
                "name='" + nameOfCountries + '\'' +
                '}';
    }
}
