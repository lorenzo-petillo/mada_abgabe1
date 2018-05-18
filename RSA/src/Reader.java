import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws IOException {


        //kann gelesen werden
        FileReader fr = new FileReader("RSA/text.txt");
        BufferedReader br = new BufferedReader(fr);

        String textInput = "";

        while( (textInput = br.readLine()) != null){
            System.out.println(textInput);
        }

        br.close();
    }
}
