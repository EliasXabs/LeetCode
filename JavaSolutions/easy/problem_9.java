package JavaSolutions.easy;

public class problem_9 {
    // Using string
    public boolean isPalindrome(int x) {
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
}
