package leetcode.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.Comparator;

public class LongestCommonPrefixSolution {
    public String LongestCommonPrefix(String[] strs) {
        int length = strs.length;
        String firstElement = strs[0];

        if (length == 1) {
            return firstElement;
        }

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 1; i < length; i++) {
            int count = 0;
            for (int j = 0 ; j < Integer.min(strs[i].length(),firstElement.length()) ; j++) {
                String current = strs[i];

                if (firstElement.isBlank() || current.isBlank()) {
                    break;
                }
                else if (firstElement.charAt(j) == current.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            temp.add(count);
        }

        temp.sort(Comparator.naturalOrder());

        if (temp.isEmpty()) {
            return "";
        } else {
            return firstElement.substring(0,temp.get(0));
        }
    }

}
