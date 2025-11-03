package br.com.jdp.others;

public class CountAndSay {
    /**
     * time: O(2^n)
     * space: O(2^n)
     */
    public static String countAndSay(int n) {
        if (n == 1) return "1";

        String result = countAndSay(n - 1);

        return runLengthEcoding(result);
    }

    static String runLengthEcoding(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != prev) {
                sb.append(count).append(prev);
                count = 0;
                prev = s.charAt(i);
            }
            count++;
        }
        sb.append(count).append(prev);

        return sb.toString();
    }


}
