package encryptions.interfaces;

public interface Encryption<T> {

    T encryptData(T dataToEncrypt);

    T decryptData(T dataToDecrypt);
}
