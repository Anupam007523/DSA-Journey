class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        int majority = nums.length/2;

        for(int num : nums){
            int currentCount = counts.getOrDefault(num,0) + 1;
            counts.put(num,currentCount);

            if(currentCount > majority){
                return num;
            }
        }
        return -1;
    }
}