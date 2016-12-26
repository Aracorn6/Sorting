import java.util.Comparator;

/**
 * Created by aracorn on 15.12.16.
 */
public class CharsComparator implements Comparator<String> {
    public int compare(String one, String two) {
        char[] firstStringElements = one.toCharArray();
        char[] secondStringElements = two.toCharArray();
        int countFirstString = 0;
        int countSecondsString = 0;
        char[] characters = new char[]{'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};

        for (int i = 0; i < firstStringElements.length; i++) {
            for (int a = 0; a < characters.length; a++) {
                if (firstStringElements[i] == characters[a]) {
                    countFirstString++;
                }
            }
        }

        for (int i = 0; i < secondStringElements.length; i++) {
            for (int a = 0; a < characters.length; a++) {
                if (secondStringElements[i] == characters[a]) {
                    countSecondsString++;
                }
            }
        }

        Integer integerCountFirst = countFirstString;
        Integer integerCountSecond = countSecondsString;

        if (integerCountSecond != integerCountFirst) {
            return integerCountSecond.compareTo(integerCountFirst);
        } else return -1;

    }
}
