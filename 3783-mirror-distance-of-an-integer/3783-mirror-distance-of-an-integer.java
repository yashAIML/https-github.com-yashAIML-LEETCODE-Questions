class Solution {
    public int mirrorDistance(int n) {
        int store = n;
        int reverse = 0;
        while(n!=0){
            int ld = n%10;
            reverse = reverse * 10 + ld;
            n = n/10;
        }

        int ans = Math.abs(store - reverse);
        return ans;
    }

}