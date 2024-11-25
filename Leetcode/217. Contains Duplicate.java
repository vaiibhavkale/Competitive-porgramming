class Solution {
    public boolean containsDuplicate(int[] nums) {

    Set<Integer> seen = new HashSet<>();

    for (int num : nums)
      if (!seen.add(num))
        return true;

    return false;
  }
}


=================================================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        result = nums.length == set.size() ? false : true;

        return result;
    }
}
