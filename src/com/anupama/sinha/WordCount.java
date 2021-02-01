package com.anupama.sinha;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Enter a sentence :: ");
        Scanner sc= new Scanner(System.in);

        String str1 = sc.nextLine();
        String[] str2 = str1.split(" ");

        HashMap<String,Integer> stmtMap = new HashMap<>();

        for(int i=0;i<str2.length;i++){
            if(stmtMap.containsKey(str2[i])){
                int count = stmtMap.get(str2[i]);
                stmtMap.put(str2[i],++count);
            }else{
                stmtMap.put(str2[i],1);
            }
        }
        System.out.println(stmtMap);
        //Loop Concept
        Iterator itr = stmtMap.entrySet().iterator();
        while(itr.hasNext()){
            //Option 1
            //System.out.println(itr.next());
            
            //Option 2
            Map.Entry next = (Map.Entry) itr.next();
            System.out.println("Key :: " + next.getKey() + " Value :: " + next.getValue());
        }

    }
}