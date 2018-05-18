import java.math.BigInteger;
import java.util.Random;

public class PrimGen {

    //Initiates p and q with 1
    private BigInteger p = BigInteger.valueOf(1);
    private BigInteger q = BigInteger.valueOf(1);

    //Initiates the RNG
    Random rand = new Random();


    /**
     * generates BigIntegers and checks them until both p and q are both primes
     */
    public void generatePrimes() {

        //checks if both are prime that p and q are not equal
        {
            while (!p.isProbablePrime(1)) {
                this.p = new BigInteger(64, rand);
            }

            while (!q.isProbablePrime(1) || p == q) {
                this.q = new BigInteger(64, rand);
            }
        }


    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getQ() {
        return q;
    }
}
