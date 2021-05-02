package com.anupama.sinha;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Find the Kth smallest element for unique numbers in non unique unsorted array
public class SmallestKthElement {
    public static void main(String[] args) {
        //Integer[] array = {9,3,7,1,6,3,2,4,9,1};

        System.out.println("Enter 10 elements for which Kth element is to be searched");
        Integer i=0;
        Integer[] array = new Integer[10];
        Scanner sc = new Scanner(System.in);
        while(i<10){
            array[i++]=sc.nextInt();
        }

        System.out.println("Smallest Kth element ::" + findSmallestKthElement(4,array));
    }

    public static Integer findSmallestKthElement(int k, Integer[] array) {
        Set uniqueList = new HashSet<Integer>(Arrays.asList(array));
        Integer[] sortedArray = new Integer[uniqueList.size()];
        uniqueList.toArray(sortedArray);
        return sortedArray[k-1];
    }
}
