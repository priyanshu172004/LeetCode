class Solution {
    public int maxDistance(int[] colors) {
        int maxDistance = 0;
        for(int left = 0; left < colors.length; left++){
            for(int right = 1; right < colors.length; right++){
                if(colors[right] != colors[left]){
                    maxDistance = Math.max(maxDistance, Math.abs(right - left));
                }
            }
        }
        return maxDistance;
    }
}