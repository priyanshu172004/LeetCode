class Solution {
    //Slope(Peek-Down) Approach
    public int candy(int[] ratings) {
        int n = ratings.length;
        int i = 1;
        int sum = 1;
        while(i < n){
            if(ratings[i] == ratings[i - 1]){
                sum += 1;
                i++;
            }
            int peek = 1;
            while(i < n && ratings[i] > ratings[i - 1]){
                peek += 1;
                sum += peek;
                i++;
            }
            int down = 1;
            while(i < n && ratings[i] < ratings[i - 1]){
                sum += down;
                i++;
                down = down + 1;
            }
            if(down > peek){
                sum += (down - peek);
            }
        }
        return sum;
    }
}