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

        char [] input = new char [textInput.toCharArray().length];
        int [] asciiOutputInArray = new int[input.length];

        while( (textInput = br.readLine()) != null){
            System.out.println("Das befindet sich im text.txt: "+ textInput);

            input = textInput.toCharArray();

            asciiOutputInArray = new int [input.length];

            for (int i = 0; i < input.length; i++) {

                //einzelne Arrays werden von char in ASCII ausgegeben und in int umgewandelt
                asciiOutputInArray [i] = input[i];
                //String asciiOutput = (int) input[i] + "-";

                fw.write(input[i]+":"+asciiOutputInArray[i]+"-");
                System.out.print( input[i] + ":" + asciiOutputInArray[i] + "-");


            }
            // ALWAYS CLOSE THINGS OR IT WILL TAKE YOU HOURS!!!
            fw.close();
            System.out.println();

        }
        br.close();

        System.out.println("jetzt kommen asciiWerte: ");


        for(int i=0 ; i<asciiOutputInArray.length; i++)
            System.out.println(asciiOutputInArray[i]);


        System.out.println("... ich habe fertisch...");




        System.out.println("ENDE");


    }
}
