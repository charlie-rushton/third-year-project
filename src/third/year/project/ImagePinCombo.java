package third.year.project;

import java.io.IOException;
import java.math.BigInteger;

public class ImagePinCombo {

    public static String ImagePinCombo(int pin, String imagePath) throws IOException, Exception {

        //array holding the bin vals of the image
        int[] binVals = hsvConvertAndBin.convertToHSV(imagePath);

        //concatenate rounded bin vals into one string
        String strConcatVals1 = "" + binVals[0] + binVals[1] + binVals[2]
                + binVals[3] + binVals[4] + binVals[5] + binVals[6]
                + binVals[7] + binVals[8];

        //convert string and pin into big int
        BigInteger intConcatVals = new BigInteger(strConcatVals1);
        BigInteger pinBig = BigInteger.valueOf(pin);

        //multiply int and pin together
        BigInteger multiplyConcatVals = intConcatVals.multiply(pinBig);

        //convert multiplied val into string
        String strConcatVals2 = "" + multiplyConcatVals;

        //hash string
        strConcatVals2 = Hash.hash256(strConcatVals2);

        //return password w/o uppercase
        return strConcatVals2;
    }
}
