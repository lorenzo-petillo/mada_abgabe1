package src;

import java.io.*;

public class HuffmanRun {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */


    public static void main(String[] args) throws IOException {

        System.out.println("START");

        System.out.println("...File wird gelesen..");
        //SHOULD read line to line and then with CharArray put into Array... so far...
        FileReader textFile = new FileReader("Huffman/text.txt");

        FileWriter fw = new FileWriter("Huffman/asciiCode.txt");
        BufferedReader br = new BufferedReader(textFile);

        String textInput = "";

        while( (textInput = br.readLine()) != null){
            System.out.println("Das befindet sich im text.txt: "+ textInput);

            char[] Input = textInput.toCharArray();


            for (int i = 0; i < Input.length; i++) {

                //einzelne Arrays werden von char in ASCII ausgegeben und in "String" umgewandelt
                String asciiOutput = ":" + (int) Input[i];

                fw.write(asciiOutput);
                System.out.println("Das befindet sich einzeln im asciiCode.txt: "+ asciiOutput);

            }

            // ALWAYS CLOSE THINGS OR IT WILL TAKE YOU HOURS!!!
            fw.close();


        }

        br.close();



        System.out.println("... ich habe fertisch...");




        System.out.println("ENDE");


    }
}
