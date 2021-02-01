package com.anupama.sinha;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        Integer num = sc.nextInt();
        sc.close();
        boolean nonPrime= false;
        for(int i=2;i<num/2;i++){
            if(num%i == 0){
                nonPrime=true;
                break;
            }
        }
        if(nonPrime)
            System.out.println("Non Prime");
        else
            System.out.println("Prime");
    }
}
