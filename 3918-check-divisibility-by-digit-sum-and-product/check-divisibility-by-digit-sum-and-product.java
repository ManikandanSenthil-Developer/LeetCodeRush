class Solution {
    public boolean checkDivisibility(int n) {
        int product=1;
        int sum=0;
        int r=n;
        while(r>0){
            int digit=r%10;
            sum+=digit;
            product*=digit;
            r=r/10;
        }
        return n%(sum+product) == 0 ? true:false;
        
    }
}