package third.year.project;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
//import java.io.File;
//import javax.imageio.ImageIO;
//import com.github.sarxos.webcam.Webcam;

public class ProjectPrototypeTesting {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, Exception {
        System.out.println("Image 1");
        ImagePinCombo.ImagePinCombo(1234, "/Users/charlierushton/Documents"
                + "/Year 3/ICP-3099 Dissertation/Image1.jpg");

        System.out.println("Image 2");
        ImagePinCombo.ImagePinCombo(1234, "/Users/charlierushton/Documents"
                + "/Year 3/ICP-3099 Dissertation/Image2.jpg");

        System.out.println("Image 3");
        ImagePinCombo.ImagePinCombo(1234, "/Users/charlierushton/Documents"
                + "/Year 3/ICP-3099 Dissertation/Image3.jpg");

        System.out.println("Image 4");
        ImagePinCombo.ImagePinCombo(1234, "/Users/charlierushton/Documents"
                + "/Year 3/ICP-3099 Dissertation/Image4.jpg");

//        Webcam webcam = Webcam.getDefault();
//        webcam.open();
//        ImageIO.write(webcam.getImage(), "JPG", new File("firstCapture.jpg"));
    }
}
