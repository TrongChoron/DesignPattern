package Singleton;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:34
 * Filename : Singleton
 */
public class Singleton {
    private static Singleton instance;
    public String age;
    public String name;

    private Singleton(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Singleton getInstance(String age, String name) {
        if (instance == null) {
            instance = new Singleton(age, name);
        }
        return instance;
    }
}
