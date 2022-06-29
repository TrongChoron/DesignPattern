package Builder;

import javax.swing.*;
import java.awt.*;
/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:42
 * Filename : GridLayout_Builder
 */
public class GridLayout_Builder implements Builder{

    private JPanel panel = new JPanel();

    @Override
    public void setWidthAndHeight(int width, int height) {
        panel.setLayout(new GridLayout(height, width));
        panel.setBackground(Color.white);
    }

    @Override
    public void startRow() {

    }

    @Override
    public void buildCell(String value) {
        panel.add(new Label(value));
    }

    @Override
    public Component getResult() {
        return panel;
    }
}
