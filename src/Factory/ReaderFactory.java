package Factory;

import Factory.Reader.*;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:24
 * Filename : ReaderFactory
 */
public class ReaderFactory {
    public ImageReader readImage(String image){
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            return new GifReader(image);
        }
        if (format.equals("jpeg")) {
            return new JpegReader(image);
        }
        return null;
    }
}
