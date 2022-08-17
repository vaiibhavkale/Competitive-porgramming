class Solution {
    public int getSum(int a, int b) {
        
        if(a == 0) return b;
        if(b == 0) return a;
    
        int xor = a^b;
        int and = a&b;
    
        return getSum(xor,and<<1);
            
    }
}
