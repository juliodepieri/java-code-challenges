package br.com.jdp.strings;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder res = new StringBuilder();
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        boolean down = false;
        int row = 0; // helps in building individual blocks of Strings

        for (int i = 0; i < s.length(); i++) {
            if (row >= 0) {
                arr[row].append(s.charAt(i));
            }

            if (row == numRows - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }

            if (!down) {
                row--;
            } else {
                row++;
            }
        }

        for (int i = 0; i < numRows; i++) {
            res.append(arr[i]);
        }
        return res.toString();
    }
}
