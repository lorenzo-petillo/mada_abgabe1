import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadnWrite {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);

        String textInput = "";

        while( (textInput = br.readLine()) != null){
            System.out.println(textInput);
        }

        br.close();
    }
}
