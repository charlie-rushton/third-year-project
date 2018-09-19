package third.year.project;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author CharlieRushton
 */
public class hsvConvertAndBin {

    public static int[] convertToHSV(String i) throws Exception {
        //Load image in
        BufferedImage img = ImageIO.read(new File(i));
        
        // Variables to store hsv values in array and rgb values as integers
        float[] hsv = new float[3];
        int r;
        int g;
        int b;
        
        // Initialise bin values to 0
        int binH1 = 0, binH2 = 0, binH3 = 0;
        int binS1 = 0, binS2 = 0, binS3 = 0;
        int binV1 = 0, binV2 = 0, binV3 = 0;

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {

                // get RGB values from pixel
                Color c = new Color(img.getRGB(x, y));
                r = c.getRed();
                g = c.getGreen();
                b = c.getBlue();

                // convert to HSV 
                Color.RGBtoHSB(r, g, b, hsv);

                //Image histogram bin 1 - HUE
                if (hsv[0] < 0.51) {
                    binH1++;
                }
                if (hsv[0] > 0.4 && hsv[0] < 0.6) {
                    binH2++;
                }
                if (hsv[0] > 0.67) {
                    binH3++;
                }

                //Image histogram bin 2 - SATURATION
                if (hsv[1] < 0.35) {
                    binS1++;
                }
                if (hsv[1] > 0.375 && hsv[1] < 0.675) {
                    binS2++;
                }
                if (hsv[1] > 0.58) {
                    binS3++;
                }

                //Image histogram bin 3 - VALUE
                if (hsv[2] < 0.31) {
                    binV1++;
                }
                if (hsv[2] > 0.2 && hsv[2] < 0.7) {
                    binV2++;
                }
                if (hsv[2] > 0.64) {
                    binV3++;
                }
            }
        }

        // Rounding each value
        binH1 = roundToNearest(binH1, 20000);

        binH2 = roundToNearest(binH2, 20000);

        binH3 = roundToNearest(binH3, 20000);

        binS1 = roundToNearest(binS1, 20000);

        binS2 = roundToNearest(binS2, 20000);

        binS3 = roundToNearest(binS3, 50000);

        binV1 = roundToNearest(binV1, 20000);

        binV2 = roundToNearest(binV2, 20000);

        binV3 = roundToNearest(binV3, 20000);

        int[] finalVals = {binH1, binH2, binH3, binS1, binS2, binS3, binV1, binV2, binV3};

        return finalVals;

    }

    private static int roundToNearest(int value, int nearest) {
        return value - (value % nearest);
    }
}
