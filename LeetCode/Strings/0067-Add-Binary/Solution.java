class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int digA = 0;
            int digB = 0;

            if (i >= 0) {
                digA = a.charAt(i) - '0';
            }
            if (j >= 0) {
                digB = b.charAt(j) - '0';
            }
            int sum = digA + digB + carry;
            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        return result.reverse().toString();

    }
}