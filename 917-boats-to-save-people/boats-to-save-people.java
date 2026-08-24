class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum=0,l=0,r=people.length-1,count=0;
        while(l<=r){
            sum=people[r]+people[l];
            if(sum<=limit){
                count++;
                l++;
                r--;
            }
            else{
                count++;
                r--;
            }
        }
        return count;
        
        
    }
}