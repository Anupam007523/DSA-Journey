class Solution {
    int Sum(int x) {
        int sum = 0;
        while (x != 0) {
            int remainder = x % 10;
            sum = sum + remainder * remainder;
            x = x / 10;
        }
        return sum;

    }

    public boolean isHappy(int n) {

        while (n != 1 && n != 4) {
            n = Sum(n);
            
        }
        return n == 1;
    }
}