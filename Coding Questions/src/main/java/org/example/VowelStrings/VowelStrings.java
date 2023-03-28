package org.example.VowelStrings;

public class VowelStrings {

    public static int vowelStrings(String[] words, int left, int right) {
        int m=0;
        for(int i=left;i<=right;i++)
        {
            char c=words[i].charAt(0);
            char d=words[i].charAt(words[i].length()-1);
            if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u') && (d=='a'||d=='e'||d=='i'||d=='o'||d=='u'))
            {
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        String words[] = {"hey","aeo","mu","ooo","artro"};
        System.out.println(vowelStrings(words,0,4));
    }
}
