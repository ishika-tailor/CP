class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int jsum=0;
            for(int j=0;j<accounts[i].length;j++){
                jsum=jsum+accounts[i][j];
            }
            if(jsum>sum){
                sum=jsum;
            }
        }
        return sum;
    }
}

//leetcode richest customer wealth