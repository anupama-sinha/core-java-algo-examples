package com.anupama.sinha;

//Extract digits in reverse & add unit wise
/*
* 237->7 3 2
  142->2 4 1
	   9 7 3 [Sum unit wise]
  Output : 9 7 3
 */
public class DigitExtractAdd {
    public static void main(String[] args) {
        //Option#1
        int num =237;
        int mod[] = {0,0,0},i=0;
        System.out.println("Option#1");
        while(num>0){
            mod[i]=num%10;
            num=num/10;
            System.out.println(mod[i++]);
        }

        //Option#2
        int num1=142;
        int rev_num=0;
        while(num1>0){
            rev_num = rev_num * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        System.out.println("Option#2");
        System.out.println(rev_num);

        //Option#3
        int numList[] = {237,142};
        System.out.println("Option#3");
        for(i=0;i<numList.length;i++){
            int rev_num1 = 0;
            while(numList[i]>0){
                rev_num1 = rev_num1 * 10 + numList[i] % 10;
                numList[i] = numList[i] / 10;
            }
            System.out.println(rev_num1);
        }

        //Option#4
        int numList1[] = {123,572};
        int rev_num1[] = {0,0};
        System.out.println("Option#4");
        for(i=0;i<numList1.length;i++){
            while(numList1[i]>0){
                rev_num1[i] = rev_num1[i] * 10 + numList1[i] % 10;
                numList1[i] = numList1[i] / 10;
            }
        }
        System.out.println(rev_num1[0]);
        System.out.println(rev_num1[1]);
        while(rev_num1[0]>0){
            int sum=0;
            System.out.println(rev_num1[0]%10+rev_num1[1]%10);
            rev_num1[0] /= 10;
            rev_num1[1] /= 10;

        }

        //Option#5
        int numList2[] = {127,562};
        int rev_num2[] = {0,0};
        System.out.println("Option#5");
        for(i=0;i<numList2.length;i++){
            while(numList2[i]>0){
                rev_num2[i] = rev_num2[i] * 10 + numList2[i] % 10;
                numList2[i] = numList2[i] / 10;
            }
        }
        System.out.println(rev_num2[0]);
        System.out.println(rev_num2[1]);
        while(rev_num2[0]>0){
            int sum=0;
            System.out.println(rev_num2[0]%10+rev_num2[1]%10);
            rev_num2[0] /= 10;
            rev_num2[1] /= 10;

        }

    }
}
