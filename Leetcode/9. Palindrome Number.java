class Solution {
    public boolean isPalindrome(int x) {
        String var = String.valueOf(x);

        int length = var.length();
        
        for(int i = 0; i < length/2; i++){
            if(var.charAt(i) != var.charAt(length-i-1)) return false;
        }
        return true;
    }
}
