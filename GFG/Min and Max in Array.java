class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        
        Arrays.sort(arr);
        long min = arr[0];
        long max = arr[arr.length-1];
        
        Pair<Long, Long> pair = new Pair<>(min, max);
       
        return pair;
    }
}
