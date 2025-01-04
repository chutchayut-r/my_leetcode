class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> map1 = new HashMap<>();
        HashMap<Integer,Boolean> map2 = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : nums1) {  // Map of num1
            map1.put(num,true);
        }

        for (int num : nums2) { // Map of num2
            map2.put(num,true);
        }


        for (int num : nums1) {  // Check num1 with Map2
            if (!map2.containsKey(num)){
                map2.put(num,true);
                list1.add(num);
            }
        }
        output.add(list1);

        for (int num : nums2) { // Check num2 with Map1
            if (!map1.containsKey(num)){
                map1.put(num,true);
                list2.add(num);
            }
        }
        output.add(list2);

        return output;
    }
}