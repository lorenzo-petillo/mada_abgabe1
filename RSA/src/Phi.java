import java.math.BigInteger;

public class Phi {

    // φ(p*q) = (p-1)(q-1) -->
    // Wir können die Primfaktorisierung überspringen, da wir diese nur aufgrund unseren mikrigen Menschenhirne brauchen

    public BigInteger calcPhi(BigInteger q, BigInteger p){
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        return phi;
    }


}
