class Solution {
    public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "II", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 2, 1};
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i<values.length; i++){
            if(num == 0){
                break;
            }
            while(num >= values[i]){
                num -= values[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
}
