package com.anupama.sinha;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/** Vowel & Non vowel grouping in ascending order
 * Input : abc; Output : a bc
 * Input : today ; Output : ao dty
 */
public class AscCharVowelGrouping {
    public static void main(String[] args) {
        String str = "acb";
        groupAscCharVowelNonVowel(str);
    }

    private static void groupAscCharVowelNonVowel(String str) {
        String vowelGrp = "",consGrp="";
        for(int i=0;i < str.length();i++){
            if(isVowel(str.charAt(i))){
                vowelGrp += str.charAt(i);
            }else{
                consGrp += str.charAt(i);
            }
        }
        System.out.println("Vowel Group ::" + vowelGrp);
        System.out.println("Consonant Group ::" + consGrp);

        //Option#1 : Sort using inbuild method
        char[] vChars = vowelGrp.toCharArray();
        char[] cChars = consGrp.toCharArray();
        Arrays.sort(vChars);
        Arrays.sort(cChars);

        System.out.println("Sorted Vowel Group :: " + new String(vChars));
        System.out.println("Sorted Consonant Group :: " + new String(cChars));
    }

    private static boolean isVowel(char ch) {
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}
