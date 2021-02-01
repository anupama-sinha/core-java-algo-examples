package com.anupama.sinha;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Reverse :: ");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        str2.append(str1);
        str2 = str2.reverse();
        System.out.println(str2);
    }
}
