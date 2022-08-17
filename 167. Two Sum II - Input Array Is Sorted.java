class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers.length == 0) return null;
        
        int firstpointer = 0; 
        int lastpointer = numbers.length-1;
        
        while(firstpointer <= lastpointer){
            int sum = numbers[firstpointer] + numbers[lastpointer];
            
            if(sum > target){
                lastpointer--;
            }else if(sum < target){
                firstpointer++;
            }else{
                return new int[] {firstpointer+1, lastpointer+1};
            }
        }
        return new int[] {firstpointer+1, lastpointer+1};
    }
}
