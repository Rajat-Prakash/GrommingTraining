package org.example.LongestWordDictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordDictionary {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set=new HashSet<>();
        String ans="";
        if(words[0].length()==1) ans=words[0];
        for(String st:words){
            if(st.length()==1){
                set.add(st);
            }
            else{
                if(set.contains(st.substring(0,st.length()-1))){
                    set.add(st);
                    if(ans.length()<st.length()) ans=st;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestWordDictionary longestWordDictionary=new LongestWordDictionary();
        System.out.println(longestWordDictionary.longestWord(new String[]{"d", "do", "dog", "p", "pe", "pen", "peng", "pengu", "pengui", "penguin", "e", "el", "ele", "elep", "eleph", "elepha", "elephan", "elephant"}));
    }
}
