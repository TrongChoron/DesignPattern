package Builder;


import javax.swing.*;
import java.awt.*;
/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:44
 * Filename : TableBuilderDemo
 */
public class TableBuilderDemo {
    public static void demo(String[] args) {
        // Name of the GUI table class can be passed to the app parameters.
        String class_name = args.length > 0 ? args[0] : "JTable_Builder";
        System.out.println(class_name);
        Builder target = null;
        try {
            target = (Builder) Class.forName(class_name)
                    .getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        String file_name = TableBuilderDemo.class.getResource("BuilderDemo.dat").getFile();
        TableDirector director = new TableDirector(target);
        director.construct(file_name);
        assert target != null;
        Component comp = target.getResult();

        JFrame frame = new JFrame("BuilderDemo - " + class_name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(comp);
        frame.pack();
        frame.setVisible(true);
    }
}
