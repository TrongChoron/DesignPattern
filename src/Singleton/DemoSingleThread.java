package Singleton;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:34
 * Filename : DemoSingleThread
 */
public class DemoSingleThread {
    public static void example(){
        Singleton singleton = Singleton.getInstance("21", "Thanh Trong");
        Singleton anotherSingleton = Singleton.getInstance("20", "Duy Nha");
        System.out.println("Age:"+ singleton.age+", name: "+ singleton.name);
        System.out.println("Age:"+ anotherSingleton.age+", name: "+ anotherSingleton.name);
    }
}
