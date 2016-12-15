import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aracorn on 15.12.16.
 */
public class WordsDataModel {
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    WordsController controller = new WordsController();

    public void enter() throws IOException {
        int length = Integer.parseInt(rd.readLine());
        String someWords = rd.readLine();
        String[] words = someWords.split(" ");
        controller.go(words, length);
    }

}
