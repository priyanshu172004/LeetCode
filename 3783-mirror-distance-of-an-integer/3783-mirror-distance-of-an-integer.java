class Solution {
    public int reverse(int num){
        int rev = 0;
        while(num > 0){
            int digit  = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        int num = reverse(n);
        return Math.abs(n - num);
    }
}