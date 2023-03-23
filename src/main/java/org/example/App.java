package org.example;


import java.util.*;

/**
 * The class App. It contains the main method.It contained a TreeSet, tree Lists and a Map.
 *
 * @author : Silvia Padurean
 */
public class App {
    public static void main(String[] args) {
        TreeSet<Person> setPeople = new TreeSet<>(new FirstComparator());


        Person silvia = new Person("Silvia", 30);
        Person gabriel = new Person("Gabriel", 34);
        Person giulia = new Person("Giulia", 65);

        setPeople.add(silvia);
        setPeople.add(gabriel);
        setPeople.add(giulia);


        System.out.println(setPeople);

        silvia.addHobby("Reading");
        silvia.addHobby("Swimming");
        silvia.addHobby("Hiking");


        List<String> silviaHobbies = silvia.getHobbiesOfPerson();

        System.out.println("The Silvia's hobby's are " + silviaHobbies);


        List<Address> addresses = new ArrayList<Address>();

        addresses.add(new Address("123 Main St", "London", 67));
        addresses.add(new Address("100 Main St", "New York", 47));

        Hobby reading = new Hobby("Reading", 3, addresses);

        System.out.print("The hobby " + silviaHobbies.get(0));
        System.out.print(" has the frequency " + reading.getFrequency());
        System.out.print(" and it can be practice at this addresses: " + reading.getAddresses());





        Map<Person, List<HobbysForMap>> map = new HashMap<>();

        Person Mary = new Person("Mary", 23);
        Person Ana = new Person("Ana", 33);


        List<HobbysForMap> MaryHobbys = new ArrayList<>();

        MaryHobbys.add(new HobbysForMap("dancing"));
        MaryHobbys.add(new HobbysForMap("swimming"));

        map.put(Mary, MaryHobbys);

        List<HobbysForMap> AnaHobbys = new ArrayList<>();

        AnaHobbys.add(new HobbysForMap("cycling"));
        AnaHobbys.add(new HobbysForMap("dancing"));

        map.put(Ana, AnaHobbys);

        map.put(Mary, MaryHobbys);

        List<Countries> countries = new ArrayList<>();


        countries.add(new Countries("Belgian"));
        countries.add(new Countries("Romania"));
        countries.add(new Countries("Anglia"));


        System.out.println(map);
        System.out.println("MARY = " + (map.get(Mary)) + "can be practice in the contras" + countries);
        System.out.println("ANA = " + map.get(Ana) + "can be practice in the contras" + countries);

    }
}













