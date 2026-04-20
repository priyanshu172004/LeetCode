class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for(int i = 1; i < colors.length; i++){
            if(colors[i] != colors[i - 1]){
                max = Math.max(max, (colors.length - 1) - i);
                break;
            }
        }
        for(int i = colors.length - 1; i >= 0; i--){
            if(colors[0] != colors[i]){
                max = Math.max(max, i);
            }
        }
        return max;
    }
}