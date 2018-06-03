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

            char[] input = textInput.toCharArray();


            for (int i = 0; i < input.length; i++) {

                //einzelne Arrays werden von char in ASCII ausgegeben und in "String" umgewandelt
                int [] asciiOutputInArray = new int [input.length];

                asciiOutputInArray [i] = input[i];
                //String asciiOutput = (int) input[i] + "-";

                fw.write(input[i]+":"+asciiOutputInArray[i]+"-");
                System.out.print( input[i] + ":" + asciiOutputInArray[i] + "-");

            }

            // ALWAYS CLOSE THINGS OR IT WILL TAKE YOU HOURS!!!
            fw.close();


        }

        br.close();



        System.out.println("... ich habe fertisch...");




        System.out.println("ENDE");


    }
}
