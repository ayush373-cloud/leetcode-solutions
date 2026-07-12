import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> res = new ArrayList<>();
        res.add(0);

        for (int i = 0; i < n; i++) {

            int size = res.size();
            int add = 1 << i;

            for (int j = size - 1; j >= 0; j--) {
                res.add(res.get(j) + add);
            }
        }

        return res;
    }
}