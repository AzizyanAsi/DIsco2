package util;

import static java.util.Arrays.sort;

public class StringUtil {
    public static String stringsCompare(String a, String b) {
        return a.compareTo(b) > 0 ? "Yes" : "No";
    }

    public static String upperFirst(String n) {
        return String.format("%s%s", n.substring(0, 1).toUpperCase(), n.substring(1));

    }

    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArr = a.toCharArray(); // or split("")
        char[] bArr = b.toCharArray();

        sort(aArr);
        sort(bArr);

        return String.valueOf(aArr).equals(String.valueOf(bArr));
    }
}
