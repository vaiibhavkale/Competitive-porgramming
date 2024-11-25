class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int minDiff = Integer.MAX_VALUE;
      
        Collections.sort(arr);
        
        for(int i = 0; arr.size() > i+m-1; i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            
            if(minDiff > diff){
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
}
