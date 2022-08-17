class Solution {
    public int getSum(int a, int b) {
        
        int sum = 0;
        
        if(a == 0) return b;
        if(b == 0) return a;
    
        int xor = a^b;
        int and = a&b;
    
        sum = getSum(xor, and<<1);
        return sum;
            
    }
}
