package com.anupama.sinha;

import java.util.HashMap;

public class ArrayStringClass {
    public static void main(String[] args) {
        String sentence = "Hey Anupama How are you doing Anupama";
        System.out.println("Length of Sentence :: " + sentence.length());

        //Count of Words
        String[] words = sentence.split(" ");
        Integer i = 0;
        HashMap<String,Integer> countWords = new HashMap<>();
        while(i<words.length){
            Integer count = 1;
            if(countWords.containsKey(words[i])){
                countWords.put(words[i],++count);
            }else{
                countWords.put(words[i],count);
            }
            i++;
        }
        System.out.println(countWords.toString());

        //Count of letters excluding space
        String[] allWords = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        Integer fullLength=0;
        for(Integer j=0;j<allWords.length;j++){
            sb.append(allWords[j]);
            fullLength+=allWords[j].length();

        }
        System.out.println("Count of Repeating Characters :: "+ fullLength);

        //Reverse the array
        String[] allWords1 = sentence.split(" ");
        StringBuilder sb1 = new StringBuilder();
        for(Integer j=allWords1.length-1;j>0;j--){
            sb1.append(allWords1[j]);
            sb1.append(" ");
        }
        System.out.println("Reversed Array :: " + sb1);
    }
}
