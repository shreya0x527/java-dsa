import java.util.*;

class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'a']--;

            if (right - left + 1 > p.length()) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length()) {

                boolean valid = true;

                for (int num : count) {
                    if (num != 0) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    ans.add(left);
                }
            }
        }

        return ans;
    }
}