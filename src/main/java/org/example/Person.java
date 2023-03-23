

package org.example;

import java.util.ArrayList;
import java.util.Objects;
/**
 * This is a class that contains 6 methods.
 *
 * @param : - name - the name of the person;
 * @param : - age - the age of the person;
 * @param : - hobbiesOfPerson - a list of hobby's;
 */
class Person {
    public String name;
    public Integer age;
    public java.util.List<String> hobbiesOfPerson;

    /**
     * This is the constructor of the class Person.
     *
     * @param : - name - the name of the person;
     * @param : - age - the age of the person;
     * @param : - hobbiesOfPerson - a list of hobby's;
     */
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobbiesOfPerson = new ArrayList<String>();

    }

    /**
     * This is a public void method that get adds the hobby to the list hobbiesOfPerson ;
     */
    public void addHobby(String hobby) {
        this.hobbiesOfPerson.add(hobby);
    }
    /**
     * This is a public method that get  the hobby's of a Person ;
     * @return hobbiesOfPerson;
     */
    public java.util.List<String> getHobbiesOfPerson() {

        return this.hobbiesOfPerson;
    }
    /**
     * This is a  method that override the String.
     *  @return hobbiesOfPerson;
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbiesOfPerson +
                '}';
    }

    /**
     * This is the equals  method  override.
     *  @return a boolean;
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Person person = (Person) o;

        if (!Objects.equals(name, person.name)) {
            return false;
        }
        return Objects.equals(age, person.age);
    }

    /**
     * This isthe hasCode  method.
     *  @return result;
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}















