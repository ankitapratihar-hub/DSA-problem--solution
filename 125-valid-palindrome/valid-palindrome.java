class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0, p2 = s.length() - 1;
        s = s.toLowerCase();

        while (p1 < p2) {
            char c1 = s.charAt(p1);
            char c2 = s.charAt(p2);

            if (!Character.isLetterOrDigit(c1)) {
                p1++;
                continue;
            }
            if (!Character.isLetterOrDigit(c2)) {
                p2--;
                continue;
            }

            if (c1 != c2) {
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }
}