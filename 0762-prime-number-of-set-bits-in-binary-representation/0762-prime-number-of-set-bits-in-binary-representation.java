class Solution {
    public boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for(int num = left; num <= right; num++){
            int n = num;
            int count = 0;
            while(n > 0){
                int bit = n % 2;
                if(bit == 1){
                    count++;
                }
                n = n/2;
            }
            if(isPrime(count)){
                result++;
            }
        }
        return result;
    }
}