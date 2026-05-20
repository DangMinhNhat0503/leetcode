package leetcode.AddBinary;

import static java.lang.Math.min;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();

        if (array1.length <= array2.length) {
            return sumBinary(array1, array2);
        } else {
            return sumBinary(array2, array1);
        }
    }

    public String sumBinary(char[] a, char[] b) {
        int carry = 0;

        int i = a.length - 1;
        int j = b.length - 1;

        while (i >= 0) {
            int sum = (a[i] - '0') + (b[j] - '0') + carry;
            b[j] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            i--;
            j--;
        }

        while (j >= 0 && carry > 0) {
            int sum = (b[j] - '0') + carry;
            b[j] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            j--;
        }


        if (carry == 1) {
            char[] result = new char[b.length + 1];
            result[0] = '1';
            System.arraycopy(b, 0, result, 1, b.length);

            return new String(result);

        } else {

            return new String(b);
        }
    }
}