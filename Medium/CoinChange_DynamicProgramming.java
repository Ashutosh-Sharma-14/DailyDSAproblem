package Medium;

public class CoinChange_DynamicProgramming {
    public static void main(String[] args) {
        int[] coins = {2,5,3,6};
        int target = 10;
        long res = total_ways(coins,coins.length-1,target);
        System.out.println(res);
    }

    static long total_ways(int[] coins, int index, int target){
        if(index == 0){
            if(target % coins[0] == 0){
                return 1;
            }
            else{
                return 0;
            }
        }

        long not_take = total_ways(coins, index-1, target);
        long take = 0;
        if(coins[index] <= target){
            take = total_ways(coins, index, target-coins[index]);
        }

        return take + not_take;
    }

}
