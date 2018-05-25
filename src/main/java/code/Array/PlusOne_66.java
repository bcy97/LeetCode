package code.Array;

public class PlusOne_66 {

    public static void main(String[] args) {
        int[] digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        boolean isNine = true;
        for (int i = 0; i < len; i++) {
            if (digits[i] != 9) {
                isNine = false;
                break;
            }
        }

        if (isNine) {
            int[] result = new int[len + 1];
            result[0] = 1;
            return result;
        }

        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        return digits;
    }
}
