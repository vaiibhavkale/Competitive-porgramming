class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int temp, value;
        
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
