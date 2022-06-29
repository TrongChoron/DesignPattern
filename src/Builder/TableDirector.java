package Builder;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:43
 * Filename : TableDirector
 */
public class TableDirector {
    public Builder builder;

    public TableDirector(Builder builder){
        this.builder = builder;
    }

    public void construct(String file_name) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file_name));
            String line;
            String[] cells;

            if ((line = br.readLine()) != null) {
                cells = line.split("\\t");
                int width = Integer.parseInt(cells[0]);
                int height = Integer.parseInt(cells[1]);
                builder.setWidthAndHeight(width, height);
            }

            while ((line = br.readLine()) != null) {
                cells = line.split("\\t");
                for (String cell : cells) {
                    builder.buildCell(cell);
                }
                builder.startRow();
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
