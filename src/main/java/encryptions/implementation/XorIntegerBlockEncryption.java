package encryptions.implementation;

import encryptions.interfaces.BlockEncryption;

import java.util.Arrays;

public class XorIntegerBlockEncryption implements BlockEncryption<Integer, Integer> {

    private static final Integer XOR_CONSTANT = 12345;

    private Integer[] doXor(Integer[] array) {
        return Arrays.stream(array)
                .map(integer -> integer ^ XOR_CONSTANT)
                .toArray(Integer[]::new);
    }

    @Override
    public Integer[] encryptData(Integer[] dataToEncrypt) {
        return doXor(dataToEncrypt);
    }

    @Override
    public Integer[] decryptData(Integer[] dataToDecrypt) {
        return doXor(dataToDecrypt);
    }

    @Override
    public Integer generateKey() {
        return XOR_CONSTANT;
    }
}
