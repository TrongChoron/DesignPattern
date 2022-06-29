package Builder;

import java.awt.*;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:41
 * Filename : Builder
 */
public interface Builder {
    void setWidthAndHeight(int width, int height);
    void startRow();
    void buildCell(String value);
    Component getResult();
}
