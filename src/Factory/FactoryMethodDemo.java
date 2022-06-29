package Factory;

import Factory.Reader.*;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 16:27
 * Filename : FactoryMethodDemo
 */
public class FactoryMethodDemo {
    public static void example() {
        String image = "image.jpeg";

        ReaderFactory factory = new ReaderFactory();
        ImageReader reader = factory.readImage(image);

        assert reader != null;
        DecodedImage decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
