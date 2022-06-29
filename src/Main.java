import Builder.TableBuilderDemo;
import DataAccessObject.DemoDAO;
import DependencyInjection.MyMessageDITest;
import Factory.FactoryMethodDemo;
import Prototype.PrototypeFactory;
import Singleton.DemoSingleThread;

/**
 * Create by: IntelliJ IDEA
 * User     : ${USER}
 * Date     : ${DAY_NAME_SHORT}, ${DATE}
 * Time     : ${TIME}
 * Filename : ${NAME}
 */
public class Main {
    public static void main(String[] args) {
        DemoSingleThread.example();
        FactoryMethodDemo.example();
        PrototypeFactory.example();
        TableBuilderDemo.demo(args);
        DemoDAO.example();
        MyMessageDITest.example();
    }
}