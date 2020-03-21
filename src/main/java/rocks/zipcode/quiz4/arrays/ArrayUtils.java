package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.StrictMath.abs;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

      return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {

        ArrayList<String> list= new ArrayList<>(Arrays.asList(values));
        list.remove((values.length)/2);
        String[] result = new String[list.size()];
        result = list.toArray(result);
        return result;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        ArrayList<String> list= new ArrayList<>(Arrays.asList(values));
        list.remove((values.length-1));
        String[] result = new String[list.size()];
        result = list.toArray(result);
        return result;
    }
}