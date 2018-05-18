import java.math.BigInteger;

public class Phi {

    // φ: (p-1)(q-1) -->
    // Wir können die Primfaktorisierung überspringen, da wir diese nur aufgrund unseren mikrigen Menschenhirne brauchen

    private BigInteger phi,n;

    public BigInteger calculatePhi(BigInteger p, BigInteger q){
        //rechnet n = p * q
        n = (p.multiply(q));

        //calculates φ
        phi = p.subtract(BigInteger.valueOf(1)).multiply(q.subtract(BigInteger.valueOf(1)));
        return phi;
    }

    public BigInteger getPhi() {
        return phi;
    }

    public BigInteger getN() {
        return n;
    }

}
