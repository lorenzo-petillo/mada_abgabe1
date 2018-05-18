import java.math.BigInteger;

public class ErwEuklAlgo {

    //initialisiere die aktuelle Reihe
    BigInteger a = BigInteger.valueOf(0);
    BigInteger b = BigInteger.valueOf(0);
    BigInteger x0 = BigInteger.valueOf(1);
    BigInteger y0 = BigInteger.valueOf(0);
    BigInteger x1 = BigInteger.valueOf(0);
    BigInteger y1 = BigInteger.valueOf(1);
    BigInteger q = BigInteger.valueOf(0);
    BigInteger r = BigInteger.valueOf(0);

    //initialisiere die nächsten Reihen
    public BigInteger calcEcu(BigInteger val1, BigInteger val2) {
        BigInteger bNR;
        BigInteger x0NR;
        BigInteger y0NR;
        BigInteger x1NR;
        BigInteger y1NR;
        BigInteger qNR;

        this.a = val1;
        this.b = val2;

        while (val2.compareTo(BigInteger.valueOf(0)) == 1) {

            x0NR = x0;
            x1NR = x1;
            y0NR = y0;
            y1NR = y1;
            bNR = val2;

            q = val1.divide(val2);
            r = val1.mod(val2);

            qNR = q;

            val1 = bNR;
            val2 = r;

            x1 = x0NR.subtract(qNR.multiply(qNR));
            y1 = y0NR.subtract(qNR.multiply(y1NR));

            x0 = x1NR;
            y0 = y1NR;

        }
        if (y0.compareTo(BigInteger.valueOf(0)) == -1) {
            y0 = val1.add(y0);
        } else {
            y0 = y0.subtract(val1);
        }

        return y0;
    }

}
