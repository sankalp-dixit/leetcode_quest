class Solution {
    public int sumDecoded(long[] nums) {
        long MOD = 1_000_000_007L;
        long ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            int width =(int)(nums[i] % 10);
            long d = nums[i]/10;
            String s = Long.toString(d);
            int n = s.length();
            String X = s.substring(0,width);
            long x = Long.parseLong(X);
            String Y = s.substring(width,n);
            long y = Long.parseLong(Y);
            ans = (ans + power(x, y, MOD)) % MOD;
        }
        return (int)ans;

    }
    private long power(long x, long y, long MOD) {

        long result = 1;

        while (y > 0) {

            if ((y & 1) == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            y /= 2;
        }

        return result;
    }
}