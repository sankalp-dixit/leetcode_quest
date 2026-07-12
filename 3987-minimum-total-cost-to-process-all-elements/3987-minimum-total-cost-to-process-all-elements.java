class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD = 1000000007L;

        long curr = k;
        long ans = 0;
        long operationsDone = 0;

        for (int num : nums) {
            if (curr < num) {
                long need = num - curr;
                long ops = (need + k - 1L) / k;

                long first = operationsDone + 1;
                long last = operationsDone + ops;

                long a = ops;
                long b = first + last;

                if ((a & 1) == 0) {
                    a /= 2;
                } else {
                    b /= 2;
                }

                long cost = ((a % MOD) * (b % MOD)) % MOD;
                ans = (ans + cost) % MOD;

                operationsDone += ops;
                curr += ops * (long) k;
            }

            curr -= num;
        }

        return (int) ans;
    }
}