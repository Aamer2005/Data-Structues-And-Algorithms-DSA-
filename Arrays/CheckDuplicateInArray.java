class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        java.util.List<Integer> list = new java.util.ArrayList<>(map.values());

        for(Integer value : list)
        {
            if(value>=2)
            return true;
        }        

        return false;
    }
}

//O(n) complexity using hash