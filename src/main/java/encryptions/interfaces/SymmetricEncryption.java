package encryptions.interfaces;

public interface SymmetricEncryption <K, T> extends Encryption<T> {

    K generateKey();

}
