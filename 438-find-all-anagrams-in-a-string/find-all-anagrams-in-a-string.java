class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] freqP = new int[26];
        int[] freqWindow = new int[26];

        // Frequency of characters in p
        for (char c : p.toCharArray()) {
            freqP[c - 'a']++;
        }

        int k = p.length();

        // Create sliding window
        for (int i = 0; i < s.length(); i++) {

            // Add current character
            freqWindow[s.charAt(i) - 'a']++;

            // Keep window size = k
            if (i >= k) {
                freqWindow[s.charAt(i - k) - 'a']--;
            }

            // Compare frequencies
            if (i >= k - 1 && Arrays.equals(freqP, freqWindow)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}