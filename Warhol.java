import java.awt.Color;

/**
 * An image filter to mirror (flip) the image horizontally.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class Warhol extends Filter
{
    /**
     * Constructor for objects of class MirrorFilter.
     * @param name The name of the filter.
     */
    public Warhol(String name)
    {
        super(name);
        
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = pix.getRed();
                int blue = pix.getBlue();
                int green = pix.getGreen();
                
                image.setPixel(x,y,new Color(blue,red,green));
            }
        }
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width / 2; x++) {
                Color left = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(width - 1 - x, y));
                image.setPixel(width - 1 - x, y, left);
            }
        }
    }
}
