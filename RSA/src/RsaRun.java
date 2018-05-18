import java.io.FileNotFoundException;
import java.math.BigInteger;

public class RsaRun {


/**
 * Anleitung
 * text.txt       = Das zur Verschlüsslung gegebene file
 * chiffre.txt    = Der verschlüsste text
 * text-d.txt     = Der entschlüsselte text ist: text-d.txt
 * pk.txt         = Der public Key
 * sk.txt         = Der Secret Key
 * **/





    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("START");

        BigInteger p,q,n,phi,e,d;

        //Initializes Modules
        PrimGen primGen = new PrimGen();
        Phi phiGen = new Phi();
        EGen eGen = new EGen();
        ErwEuklAlgo erwEuklAlgo = new ErwEuklAlgo();

        //Calculates and Saves Values
        primGen.generatePrimes();
        p = primGen.getP();
        q = primGen.getQ();
        n = (p.multiply(q));
        phi = phiGen.calculatePhi(p,q);
        e = eGen.calculateE();
        d = erwEuklAlgo.calcEcu(phi,e);

        System.out.println(("(" + n + "," + e + ")"));
        System.out.println(("(" + n + "," + d + ")"));

        //text lesen und Datei Überprüfen
        System.out.println("Nachricht wird gelesen");

        // hier wird dann eingelesen und einzeln als char abgespeichert

        //toDo: String von text.txt lesen lassen
        String text = "ABCabc123!";
        char[] Input = text.toCharArray();

        System.out.println("Das sollte in ASCII umgewandelt werden:");
        System.out.println(Input);


        //toDo: Methode daraus machen?

            for (int i = 0; i < Input.length; i++) {

                //einzelne Arrays werden von char in ASCII ausgegeben und in String umgewandelt
                String ascii = "" + (int) Input[i];

                // ASCII RSA-verschlüsseln und mit Komma trennen

                //toDo: Text verschlüsselt in in chiffre.txt abspeichern
                //BigInteger encrypt = encrypt.mod();

                System.out.println(ascii);

            }


        System.out.println();

        System.out.println("ENDE");


    }
}
