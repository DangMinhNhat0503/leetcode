package leetcode.FindTheIndexOfTheFirstOccurrence;

public class FindTheIndexOfTheFirstOccurrence {
    public int strStr(String haystack, String needle) {
        //Input: haystack = "sadbutsad", needle = "sad"
        //Output: 0

        // Cách cheat
        //        String result = haystack.replaceFirst(needle, "*");
        //
        //        for (int i = 0; i < result.length(); i++) {
        //            Character c = result.charAt(i);
        //            if (c.equals('*')) {
        //                return i;
        //            }
        //        }
        //
        //        return -1;

        //Cách khác

        int lengthHaystack = haystack.length();
        int lengthNeedle = needle.length();

        if (lengthNeedle == lengthHaystack && haystack.equals(needle)) {
            return 0;
        }

        int index = -1;


        for (int i = 0; i <= (lengthHaystack - lengthNeedle); i++) {
            if (haystack.substring(i, i + lengthNeedle).equals(needle)) {
                index = i;
                return index;
            }
        }

        return index;
    }
}
