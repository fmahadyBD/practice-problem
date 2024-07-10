class Solution {
     public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=nums[i];
            }else{
                sum=sum+nums[i];
            }
            max=Math.max(max,sum);
            
        }

        return max;
    }
}
