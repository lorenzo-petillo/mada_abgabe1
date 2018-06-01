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


        //SHOULD read line to line and then with CharArray put into Array... so far...
        FileReader fr = new FileReader("Huffman/text.txt");
        FileWriter fw = new FileWriter("Huffman/asciiCode.txt");
        BufferedReader br = new BufferedReader(fr);

        String textInput = "";

        while( (textInput = br.readLine()) != null){
            //System.out.println(textInput);

            char[] Input = textInput.toCharArray();



            for (int i = 0; i < Input.length; i++) {

                //einzelne Arrays werden von char in ASCII ausgegeben und in "String" umgewandelt
                String asciiOutput = ":" + (int) Input[i];

                fw.write(asciiOutput);

            }

            // ALWAYS CLOSE THINGS OR IT WILL TAKE YOU HOURS!!!
            fw.close();


        }


        br.close();



        System.out.println("ENDE");


    }
}
