package application;

import domain.Person;

public class Program {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Dieferson", "diefersonamatos@gmail.com");
        Person person2 = new Person(2, "Marina", "ma.anzze@gmail.com");
        Person person3 = new Person(3, "Blondie", "blondie@gmail.com");
        Person person4 = new Person(4, "Lemmy", "lemmy@gmail.com");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
