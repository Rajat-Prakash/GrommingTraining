package org.example.LongestSubstrWithoutRepeat;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstr {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int start=0,end=0,ans=0;
        while(start<=end && end<s.length()){

            while (set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            end++;
            if(end-start>ans) ans=end-start;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("asgsdagfafsdaaas"));
    }
}
