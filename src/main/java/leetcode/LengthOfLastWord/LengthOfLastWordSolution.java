package leetcode.LengthOfLastWord;

public class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {
        //Input: s = "   fly me   to   the moon  "
        //Output: 4
        int length = s.length();
        int startIndex = -1;
        int endIndex = -1;


        for (int i = length - 1; i>=0 ; i--) {
           if (s.charAt(i) != ' ') {
               endIndex = i;
               break;
           }
        }

        if (endIndex == -1) {
            return 0;
        }

        for (int j = endIndex; j>=0 ; j--) {
            if (s.charAt(j) == ' ') {
                startIndex = j + 1;
                break;
            }
        }

        if (startIndex == -1) {
            startIndex = 0;
        }

        return s.substring(startIndex, (endIndex + 1)).length();
    }
}
