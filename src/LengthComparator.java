import java.util.Comparator;

/**
 * Created by aracorn on 15.12.16.
 */
public class LengthComparator implements Comparator<String> {
    public int compare(String one, String two) {
        Integer firstLength = one.length();
        Integer secondLength = two.length();
        return (secondLength.compareTo(firstLength));
    }

}
