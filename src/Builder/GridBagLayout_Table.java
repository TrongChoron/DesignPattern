package Builder;

import javax.swing.*;
import java.awt.*;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:42
 * Filename : GridBagLayout_Table
 */
public class GridBagLayout_Table implements Builder{
    private JPanel panel;
    private int x = 0, y = 0;
    private GridBagConstraints c = new GridBagConstraints();

    @Override
    public void setWidthAndHeight(int width, int height) {
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.white);
    }

    @Override
    public void startRow() {
        x=0;
        y+=1;
    }

    @Override
    public void buildCell(String value) {
        c.gridx = x++;
        c.gridy = y;
        panel.add(new Label(value), c);
    }

    @Override
    public Component getResult() {
        return panel;
    }
}