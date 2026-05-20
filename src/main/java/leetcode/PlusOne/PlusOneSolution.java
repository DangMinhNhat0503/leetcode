package leetcode.PlusOne;

public class PlusOneSolution {
    public int[] plusOne(int[] digits){
        //Input: digits = [1,2,3]
        //Output: [1,2,4]
        //Input: digits = [9]
        //Output: [1,0]

        int temp = 0;
        boolean check = true;
        int length = digits.length;

        for (int i = 0; i < length; i++) {
            if (digits[i] != 9) {
                check = false;
                break;
            }
        }

        if (check) {

            int [] newDigits = new int[length + 1];
            int newLength = newDigits.length;
            newDigits[0] = 1;

            for (int i = 1; i < newLength ; i++) {
                newDigits[i] = 0;
            }

            return newDigits;
        }

        int[] oneArray = new int[length];
        oneArray[length - 1] = 1;

        for (int i = length - 1; i >= 0; i--){
            if (digits[i] + oneArray[i] == 10) {
                digits[i] = 0;
                digits[i-1] = digits[i-1] + 1;
            } else if (i == length - 1){
                digits[i] = digits[i] + 1;
            }
        }

        return digits;
    }
}
