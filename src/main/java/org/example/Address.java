package org.example;
/**
 * This is a class that contains 5 methods.
 *
 * @param : - street - the name of the street;
 * @param : - city - the name  of the city;
 * @param : - number - the number of street;
 *
 */
public class Address {
    private String street;
    private String city;
    private int number;
    /**
     * This is the constructor of the class Address .
     * @param : - street - the name of the street;
     * @param : - city - the name  of the city;
     * @param : - number - the number of street;
     */
    public Address(String street, String city, int number) {
        this.street = street;
        this.city = city;
        this.number = number;

    }
    /**
     * This is a public method that get the name of the street. ;
     * @return street;
     */
    public String getStreet() {
        return street;
    }
    /**
     * This is a public method that get the name of the cityt. ;
     * @return city;
     */
    public String getCity() {
        return city;
    }
    /**
     * This is a public method that get the number of the street. ;
     * @return number;
     */
    public int getNumber() {
        return number;
    }
    /**
     * This is a  method that override the String.
     *  @return street, city, number;
     */
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", number=" + number +
                '}';
    }
}
