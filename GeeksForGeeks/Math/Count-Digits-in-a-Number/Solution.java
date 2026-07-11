class Solution {
    public static int countDigits(int n) {
        // Code here
        int temp;
        int count=0;
        
        while(n!=0){
            temp=n;
            int remainder=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}
