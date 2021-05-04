package com.anupama.sinha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Input ::
 * 5[Pirate Count]
 * 7 10 6 4[Gold Piles containing number of coins each]
 * Output ::
 * 7 10 6 4 0[No. of gold coins each pirate has if they choose greedy approach to pull from leftmost or rightmost pile]
 */
public class PirateGoldPileGreedyPick {

    public static void main(String[] args) throws IOException {

        //Taking input for count of pirates and gold coins in each pile
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        Integer pirateCount = Integer.parseInt(in.readLine());
        int[] goldPiles = Arrays.stream(in.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        Integer pileCount = goldPiles.length;
        Integer[] pirateCoins = new Integer[pirateCount];

        //Hardcoded input for count of pirates and gold coins in each pile
        /*pirateCount=5;
        pirateCoins = new Integer[pirateCount];
        String[] goldPiles = new String[]{"7", "10", "4", "6"};
        pileCount = goldPiles.length;*/

        //Initializing leftmost and rightmost gold coin pile
        Integer left = 0;
        Integer right = pileCount-1;

        //Initializing pirateCount
        for(int k=0;k<pirateCount;k++)
            pirateCoins[k]=0;

        //Assigning each pirate with gold pile having maximum count
        for(Integer j=0,pirate=0;j<pileCount && right>=left;j++,pirate++){
            if(goldPiles[left]>goldPiles[right]){
                pirateCoins[pirate]+=goldPiles[left];
                left++;
            }
            else{
                pirateCoins[pirate]+=goldPiles[right];
                right--;
            }
        }

        //Displaying count of gold coins with each pirate
        for(Integer k=0;k<pirateCount;k++){
            System.out.print(pirateCoins[k]+" ");
        }

    }
}
