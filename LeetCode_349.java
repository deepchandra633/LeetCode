import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int i : nums1) {
            st.add(i);
        }

        for (int i : nums2) {
            if (st.contains(i)) {
                ans.add(i);
            }
        }

        int arr[] = new int[ans.size()];
          int idx = 0;
        for (int i : ans) {
            arr[idx] = i;
            idx++;
        }
        return arr;

    }
}
