public class RsaRun {

    /*

     Anleitung
     text.txt       = Das zur Verschlüsslung gegebene file
     chiffre.txt    = Der verschlüsste text
     text-d.txt     = Der entschlüsselte text ist: text-d.txt
     pk.txt         = Der public Key
     sk.txt         = Der Secret Key


     */

    public static void main(String[] args) {
        VerUndEntschluesslung chiffre = new VerUndEntschluesslung();

        System.out.println("START");
        System.out.println(" ");

        chiffre.generateKeys();
        chiffre.verschuesslung();
        chiffre.decryption();

        System.out.println(" ");
        System.out.println("ENDE");


    }
}
