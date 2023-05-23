package br.com.jdp.array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] == 0) {
                if (i == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    System.arraycopy(digits, 0, result, 1, digits.length);
                    return result;
                }
            } else {
                return digits;
            }
        }
        return digits;
    }

//    public int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >=0; i--) {
//            if (digits[i] != 9) {
//                digits[i]++;
//                break;
//            } else {
//                digits[i] = 0;
//            }
//        }
//        if (digits[0] == 0) {
//            int[] res = new int[digits.length+1];
//            res[0] = 1;
//            return res;
//        }
//
//        return digits;
//    }
}
