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

    public boolean containsDuplicateUsingArray(int[] nums){

        int[] arr = new int[11];//assumes all elements inserted are less than equal 10

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        java.util.ArrayList<Integer> al = new java.util.ArrayList<>();
        boolean result = false;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>1)
            {
            result = true;
            al.add(i);
            }
        }
        System.out.println(al);
        return true;

    }
}

//O(n) complexity using hash