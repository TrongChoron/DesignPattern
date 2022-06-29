package Prototype;

import Prototype.Person.Person;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:37
 * Filename : PrototypeFactory
 */
public class PrototypeFactory {
    public static void example(){
        String[] names = {"Dick", "Harry", "Tom", "Johnson"};
        for (String type : names) {
            Person prototype = Factory.getPrototype(type);
            if (prototype != null) {
                System.out.println(prototype);
            }
        }
    }
}
