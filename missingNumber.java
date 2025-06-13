class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> current = new ArrayList<Integer>();
        for(int i=0; i<=nums.length;i++){
            current.add(i);
        }
        for(int i=0; i<nums.length;i++){
            current.remove(Integer.valueOf(nums[i]));
        }
        return current.get(0);
    }
}
