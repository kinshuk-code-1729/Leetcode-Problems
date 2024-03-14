class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length, len2 = nums2.length;
        int i = 0, j = 0;
        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int N = set.size();
        int nums[] = new int[N];
        int I = 0;
        for(Integer val : set){
            nums[I] = val;
            I++;
        }

        return nums;
    }
}
