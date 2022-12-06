package JavaSolutions.easy;

public class problem_9 {
    // Using string

    public boolean isPalindromeS(int x) {
        String z = Integer.toString(x);

        if (!z.startsWith("-")) {
            for (int i = 0; i < z.length() / 2; i++) {
                int j = z.length() - i - 1;
                if (z.charAt(i) != z.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // Using int
    public static boolean isPalindromeI(int x) {
        int reverse = 0;
        if (x > 0) {
            int n;
            n = x;
            while (n > 0) {
                reverse = (reverse * 10) + n % 10;
                n = n / 10;
            }
        }
        return x == reverse;
    }
}