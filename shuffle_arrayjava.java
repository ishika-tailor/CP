class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ar=new int[nums.length];
        int l=nums.length;
        for(int i=0;i<n;i++){
            ar[(2*i)]=nums[i];
            ar[(2*i+1)]=nums[n+i];
        }
        return ar;
    }
}

//shuffle array
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].