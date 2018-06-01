package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Scanner {


    String textInput;


    public String reader(String textOutput) throws IOException {

        FileReader fr;
        BufferedReader br;

        //kann gelesen werden
        fr = new FileReader("Huffman/text.txt");
        br = new BufferedReader(fr);

        textInput = new String ("");

        try {
            while ((textInput = br.readLine()) != null) {
                System.out.println(textInput);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //hier kommt null raus
        return textInput;


    }


}
