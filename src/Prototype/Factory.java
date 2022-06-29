package Prototype;

import Prototype.Person.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:37
 * Filename : Factory
 */
public class Factory {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("Tom", new Tom());
        prototypes.put("Dick", new Dick());
        prototypes.put("Harry", new Harry());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}
