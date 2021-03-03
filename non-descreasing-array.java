class Solution {
    public boolean checkPossibility(int[] nums) {
        int i,count=0;
        int n= nums.length;
        for(i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                if(i>0){
                    if(nums[i-1]<=nums[i+1]){
                        nums[i]=nums[i-1];
                    }
                    else{
                        nums[i+1]=nums[i];
                    }
                    count++;
                }
                else{
                    nums[i]=nums[i+1];
                    count++;
                }
                
            }
        }
        if(count<=1){
            return true;
        }
        return false;
    }
}

