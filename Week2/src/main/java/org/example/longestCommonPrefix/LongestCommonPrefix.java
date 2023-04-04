package org.example.longestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0)
            return "";

        Arrays.sort(strings);
        String first = strings[0];
        String last = strings[strings.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }

    public static void main(String[] args) {
        String strings[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
}
