import encryptions.implementation.XorIntegerBlockEncryption;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        XorIntegerBlockEncryption encryption = new XorIntegerBlockEncryption();
        Integer[] given = {1, 2, 3, 4, 5, 6, 7};
        Integer[] encrypted = encryption.encryptData(given);
        System.out.println("Encrypted: " + Arrays.toString(encrypted));
        Integer[] decrypted = encryption.decryptData(encrypted);
        System.out.println("Decrypted:" + Arrays.toString(decrypted));
        System.out.println("Is decryption correct: " + Arrays.equals(given, decrypted));
    }
}
