import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {

    public static final Season[] SEASONS = Season.values();

    /**
     * Sorts an array of Comparable objects according to the
     * "comparison key" defined for them
     */
    static void sortSeasonable(Comparable[] seasonable) {
        Arrays.sort(seasonable);
    }

    /**
     * Returns a string describing all objects of type Seasonable that it receives
     * @param seasonable
     * @return
     */
    static String reportAll(Seasonable[] seasonable)
    {
        ArrayList<String> array = new ArrayList<>();
        for (Seasonable s: seasonable) {
            array.add(s.toString());
        }
        return String.join("\n",array);
    }
    }

