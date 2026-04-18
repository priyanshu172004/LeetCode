class Solution {
    public int mirrorDistance(int n) {
        StringBuilder s = new StringBuilder(Integer.toString(n)).reverse();
        int num = Integer.parseInt(s.toString());
        return Math.abs(n - num);
    }
}