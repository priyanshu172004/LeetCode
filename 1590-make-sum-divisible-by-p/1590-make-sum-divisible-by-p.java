import java.util.*;

class Solution {
    public int minSubarray(int[] nums, int p) {

        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + (long) nums[i];
        }

        long total = prefix[nums.length - 1];
        long mod = total % p;

        if (mod == 0) return 0;

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);

        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            long currMod = prefix[i] % p;
            long needed = (currMod - mod + p) % p;

            if (map.containsKey(needed)) {
                int j = map.get(needed);
                ans = Math.min(ans, i - j);
            }

            map.put(currMod, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}
