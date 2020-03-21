package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static Character getMiddleCharacter(String string) {

        if (string.length() == 1) { return string.charAt(0);}
        else
            return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        String[] strArray = str.split("");
        strArray[str.length()/2] = strArray[str.length()/2].toUpperCase();
        return String.join("", strArray);
    }

    public static String lowerCaseMiddleCharacter(String str) {

        String[] strArray = str.split("");
        strArray[str.length()/2] = strArray[str.length()/2].toLowerCase();
        return String.join("", strArray);
    }

    public static Boolean isIsogram(String str) {

        int i = 0;
        str = str.toLowerCase();
        char sArray[] = str.toCharArray();
        Arrays.sort(sArray);
        for (i = 0; i < str.length(); i++) {
            if (sArray[i] == sArray[i + 1]) {
                return false;
            }
        } return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        int i = 0;
        while (i<str.length()-1)
            {
                if (str.charAt(i) == str.charAt(i + 1)) {

                i++;
                return true;
            }
            i++;
        }return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        if(hasDuplicateConsecutiveCharacters(str)==true){

            String[] strArray = str.split("");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length() - 2; i++) {
                if (strArray[i].equals(strArray[i + 1])) {
                    i++;
                } else if (!strArray[i].equals(strArray[i + 1])) {
                    sb.append(strArray[i]);
                }
            }
            if (!strArray[str.length() - 1].equals(str.length() - 2)) {
                sb.append(strArray[str.length() - 1]);
            }
            return sb.toString();
        }
        else { return str;}
    }

    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}