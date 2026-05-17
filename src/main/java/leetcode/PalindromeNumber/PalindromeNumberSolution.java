package leetcode.PalindromeNumber;


public class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        int length = y.length();
        int neededLength = (length)/2; // Do length / 2 đã tu dong lam tron xuong nen khong can phai dung Math.floor()

        if (x < 0) {
            return false;
        }

        for (int i = 0; i < neededLength; i++) {
            if (y.charAt(i) != y.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

/* cach lam cua Pro/AI/ChatGPT/Gemini

public boolean isPalindrome(int x) {
    // 1. Loại biên
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;

    int revertedNumber = 0;
    // 2. Đảo ngược 1 nửa
    while (x > revertedNumber) {
        revertedNumber = revertedNumber * 10 + x % 10;
        x /= 10;
    }

    // 3. So sánh (xử lý cả chẵn và lẻ chữ số)
    return x == revertedNumber || x == revertedNumber / 10;
} */
