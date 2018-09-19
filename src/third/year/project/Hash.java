package third.year.project;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class Hash {

    public static String hash256(String stringToHash) throws NoSuchAlgorithmException {
        // Use SHA-256 hashing
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // Updates the digest using the specified bytes
        md.update(stringToHash.getBytes(StandardCharsets.UTF_8));
        
        // Creates byte array, filling with completed hash
        byte[] digest = md.digest();

        // Formats final string
        String outputString = String.format("%064x", new BigInteger(1, digest));

        return outputString;
    }
}
