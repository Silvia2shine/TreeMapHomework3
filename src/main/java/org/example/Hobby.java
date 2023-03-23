package org.example;

import java.util.List;
/**
 * This is a class that contains 4 methods.
 *
 * @param : - name - the name of the hobby;
 * @param : - frequency - the frequency  of the hobby;
 * @param : - addresses - a list of the addresses of the hobby;
 *
 */
public class Hobby {
    private String name;
    private int frequency;
    private List<Address> addresses;
    /**
     * This is the constructor of the class Hobby .
     *
     * @param : - name - the name of the hobby;
     * @param : - frequency - the frequency  of the hobby;
     * @param : - addresses - a list of the addresses of the hobby;
     */

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }
    /**
     * This is a public method that get the name of the hobby. ;
     * @return name;
     */
    public String getName() {

        return name;
    }
    /**
     * This is a public method that get the frequency of the hobby. ;
     * @return  frequency;
     */
    public int getFrequency() {

        return frequency;
    }
    /**
     * This is a public method that get the addresses of the hobby. ;
     * @return  addresses;
     */
    public List<Address> getAddresses() {

        return addresses;
    }
}
