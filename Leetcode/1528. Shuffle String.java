class Solution {
    public String restoreString(String s, int[] indices) {
        
        Map<Integer, Character> map = new HashMap<>();
        String result = "";

        for(int i = 0; i<s.length(); i++){
            int key = indices[i];
            char value = s.charAt(i);
            map.put(key, value);
        }

        Arrays.sort(indices);

        for(int i = 0; i < indices.length; i++){ 
            result = result + map.get(indices[i]);
        }

        return result;
    }
}

===========================================================================================================

  class Solution {
    public String restoreString(String s, int[] indices) {
             char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);

    }
}
