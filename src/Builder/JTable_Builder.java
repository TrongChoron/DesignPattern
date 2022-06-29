package Builder;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:43
 * Filename : JTable_Builder
 */
public class JTable_Builder implements  Builder{

    private JTable table;
    private TableModel model;
    private int x=0, y=0;

    @Override
    public void setWidthAndHeight(int width, int height) {
        table = new JTable(width, height);
        model = table.getModel();
    }

    @Override
    public void startRow() {
        x=0;
        y+=1;
    }

    @Override
    public void buildCell(String value) {
        model.setValueAt(value, y, x++);
    }

    @Override
    public Component getResult() {
        return table;
    }
}
