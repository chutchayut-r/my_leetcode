class Solution {
   public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> output = new ArrayList<>();
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();

        for (int num : nums1) { 
            list1.add(num);
        }

        for (int num : nums2) { 
            list2.add(num);
        }

        for (int num : nums2) { 
            if (list1.contains(num)){
                list1.remove(num);
            }
        }
        output.add(new ArrayList<>(list1));

        for (int num : nums1) { 
            if (list2.contains(num)){
                list2.remove(num);
            }
        }
        output.add(new ArrayList<>(list2));

        return output;
    }
}