package com.anupama.sinha;

import java.util.Scanner;

public class ReverseStringManually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Reverse :: ");
        String str1 = sc.nextLine();
        char chars[] = str1.toCharArray();
        for(int i=str1.length()-1;i>=0;i--){
            System.out.println(chars[i]);
        }

    }
}
