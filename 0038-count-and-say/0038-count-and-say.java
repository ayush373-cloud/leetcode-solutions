class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {

            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 1; j <= s.length(); j++) {

                if (j < s.length() && s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(s.charAt(j - 1));
                    count = 1;
                }
            }

            s = temp.toString();
        }

        return s;
    }
}