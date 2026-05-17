package leetcode.RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
    public int romanToInt(String s){
        Map<String, Integer> basicMap = new HashMap<>();
        basicMap.put("I", 1);
        basicMap.put("V", 5);
        basicMap.put("X", 10);
        basicMap.put("L", 50);
        basicMap.put("C", 100);
        basicMap.put("D", 500);
        basicMap.put("M", 1000);

        Map<String, Integer> minusMap = new HashMap<>();
        minusMap.put("IV", 4);
        minusMap.put("IX", 9);
        minusMap.put("XL", 40);
        minusMap.put("XC", 90);
        minusMap.put("CD", 400);
        minusMap.put("CM", 900);

        int length = s.length();
        int sum = 0;
        int i;

        for (i = 0; i < length; i++) {
            if ((s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') && (i < length - 1)) {
                String x = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
                if (minusMap.containsKey(x)) {
                    sum = sum + minusMap.get(x);
                    i = i+1;
                } else {
                    sum = sum + basicMap.get(String.valueOf(s.charAt(i)));
                }
            } else {
                sum = sum + basicMap.get(String.valueOf(s.charAt(i)));
            }
        }

        return sum;
    }

    /* cach lam cua chatGPT

    public int romanToInt(String s) {
    int sum = 0;

    for (int i = 0; i < s.length(); i++) {
        int current = value(s.charAt(i));

        if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
            sum -= current;
        } else {
            sum += current;
        }
    }

    return sum;
}

private int value(char c) {
    switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}

    */
}