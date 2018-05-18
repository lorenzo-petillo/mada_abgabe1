import java.math.BigInteger;
import java.util.Random;

public class EGen {

    private BigInteger e = BigInteger.valueOf(1);

    Random rand = new Random();

    public BigInteger calculateE() {
        while (!e.isProbablePrime(1)) {
            this.e = new BigInteger(64, rand);
        }
        return e;

    }

}
