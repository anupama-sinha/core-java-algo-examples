package com.anupama.sinha;

import java.util.Arrays;

public class ShiftIntInCircularLoop {
    public static void main(String[] args) {
        int [] a= {1,2,3,4,5};

        //Shift Digits By 2 Digits(Left : 1,0/Right : 0,1)
        shiftLeftByOneDigit(a,2,0,1);

        System.out.println(Arrays.toString(a));
    }

    public static void shiftLeftByOneDigit(int[] a,int n,int srcPos, int destPos){
        for(int shiftCount=0;shiftCount<n;shiftCount++){
            int standBy = 0;
            if(srcPos>destPos)
                standBy = a[0];
            else
                standBy = a[a.length-1];
            System.arraycopy(a,srcPos,a,destPos,a.length-1);
            if(srcPos>destPos)
                a[a.length-1] = standBy;
            else
                a[0] = standBy;
        }
    }
}


