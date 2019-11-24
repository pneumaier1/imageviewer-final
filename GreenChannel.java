import java.awt.Color;
/**
 * Write a description of class RedTint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GreenChannel extends Filter
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class RedTint
     */
    public GreenChannel(String name)
    {
        super(name);
       
    }
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
             for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = pix.getRed();
               
                int green = pix.getGreen();
                
                int blue = pix.getBlue();
                
                image.setPixel(x, y, new Color(0, green, 0));
            }
        }  
    }
}
