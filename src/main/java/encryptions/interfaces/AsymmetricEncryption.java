package encryptions.interfaces;

public interface AsymmetricEncryption<O, P, T> extends Encryption<T> {

    O generateOpenKey();

    P generatePrivateKey();
}
