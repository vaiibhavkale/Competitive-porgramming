class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n){
	    
	    int[] arr1 = arr.clone();
	    Arrays.sort(arr1);
	    
	    int maxelement = arr1[arr1.length-1];
	    
	    for(int i = 0; i<=n-1; i++){
	        if(arr[i] == maxelement){
	            return i;
	        }
	    }
	    return 0;
    }
}
