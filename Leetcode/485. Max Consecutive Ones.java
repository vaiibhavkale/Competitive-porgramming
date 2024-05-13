class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int ans = 0;
        
        for(int num: nums){
            if(num == 1){
                ans = Math.max(ans, ++count);
            }else{
                count = 0;
            }
        }
        return ans;
    }
}
