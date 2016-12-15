import java.util.Arrays;

/**
 * Created by aracorn on 15.12.16.
 */
public class WordsController {
    ConsoleWordsView view = new ConsoleWordsView();

    public void go(String[] words, int length) {
        CharsComparator charsComp = new CharsComparator();
        Arrays.sort(words, charsComp);
        LengthComparator lengthComp = new LengthComparator();
        Arrays.sort(words, lengthComp);
        view.output(words, length);
    }
}
