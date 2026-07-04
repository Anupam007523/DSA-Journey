class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int originalNum = Math.abs(n);
        int remainder = 0;
        int reverse = 0;
        while(originalNum != 0 ){
            remainder = originalNum % 10;
            reverse = reverse*10 + remainder;
            originalNum = originalNum/10;
        }
        return (reverse == Math.abs(n));
    }
}