package org.example.dynamicprogramming;

import java.util.Arrays;

public class MakeChange {
    public static void main(String[] args) {
        int[] coins ={186,419,83,408};
        System.out.println(makeChange(coins,6249)); //25,10,5,1
    }

    private static int makeChange(int[] coins, int amount) {

        if(amount == 0) return 0;

        Arrays.sort(coins);
        int len = coins.length;
        int result=0;
        int origAmount = amount;
        int finalAmount=0;
        for(int i=len-1;i>=0 && amount>0;i--){
            int coinsReq = amount/coins[i];
            if(coinsReq > 0) {
                amount = amount%coins[i];
            }
            result+=coinsReq;
            finalAmount+=coinsReq*coins[i];
        }
        return result>0 && finalAmount == origAmount?result:-1;

    }
}
