package com.anupama.sinha;

import java.util.*;

/*
Print all possible words from phone digits
https://www.geeksforgeeks.org/find-possible-words-phone-digits/
*/
public class NumberPadWords {
    private static Character[][] numberToCharMap;

    /*public static void main(String[] args) {
        int[] intput = {4,1,2,8,1};

        private static final Map<Integer,Set<String>> keypad = ImmutableMap.of(
                1,ImmmutableSet<String>of(),
                2, ImmutableSet.of("a","b","c")

        );

        private static final Map<String,String> dictionary = Immutable.of(..);
     }*/

    public static void main(String[] args) {
        int[] input = {4,1,2,8,1};
        printWords(input);
    }

    public static void printWords(int[] input){
        generateNumToCharMap();
        List<String> stringList = guessWords(input,input.length,0,"");
        stringList.stream().forEach(System.out::println);
    }

    private static List<String> guessWords(int[] input,int length,int numIndex,String str) {
        if(length == numIndex){
            return new ArrayList<>(Collections.singleton(str));
        }
        List<String> stringList = new ArrayList<>();
        for(int i=0;i<numberToCharMap[input[numIndex]].length;i++){
            String sCopy = String.copyValueOf(str.toCharArray());
            sCopy.concat(numberToCharMap[input[numIndex]][i].toString());
            stringList.addAll(guessWords(input,length,numIndex+1,sCopy));

        }
        return stringList;
    }

    private static void generateNumToCharMap() {
        numberToCharMap = new Character[10][5];
        numberToCharMap[0] = new Character[]{'\0'};
        numberToCharMap[1] = new Character[]{'\0'};
        numberToCharMap[2] = new Character[]{'a','b','c'};
        numberToCharMap[3] = new Character[]{'d','e','f'};
        numberToCharMap[4] = new Character[]{'g','h','i'};
        numberToCharMap[5] = new Character[]{'j','k','l'};
        numberToCharMap[6] = new Character[]{'m','n','o'};
        numberToCharMap[7] = new Character[]{'p','q','r','s'};
        numberToCharMap[8] = new Character[]{'t','u','v'};
        numberToCharMap[9] = new Character[]{'w','x','y','z'};
    }
}
