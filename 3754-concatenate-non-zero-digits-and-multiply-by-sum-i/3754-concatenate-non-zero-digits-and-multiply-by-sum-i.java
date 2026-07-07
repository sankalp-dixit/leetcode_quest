class Solution {
    public long sumAndMultiply(int n) {
        int i = 0;
        long sum = 0;
        long newn = 0;
        while(n > 0){
            if(n % 10 != 0){
                sum += n %10;
                newn += (n % 10)* (int)Math.pow(10,i);
                i++;
            }
            n = n/10;
        }
        return newn * sum;
    }
}