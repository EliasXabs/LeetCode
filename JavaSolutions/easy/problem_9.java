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

    // main method
    public static void main(String[] args) {
        problem_9 solution = new problem_9();
        System.out.println(solution.isPalindromeS(121));
        System.out.println(solution.isPalindromeS(-121));
        System.out.println(solution.isPalindromeS(10));
        System.out.println(solution.isPalindromeS(-101));
        System.out.println(solution.isPalindromeS(0));
        System.out.println(solution.isPalindromeS(1));
        System.out.println(solution.isPalindromeS(11));
        System.out.println(solution.isPalindromeS(111));
        System.out.println(solution.isPalindromeS(1111));
        System.out.println(solution.isPalindromeS(11111));
        System.out.println(solution.isPalindromeS(111111));
        System.out.println(solution.isPalindromeS(1111111));
        System.out.println(solution.isPalindromeS(11111111));
        System.out.println(solution.isPalindromeS(111111111));
        System.out.println(solution.isPalindromeS(1111111111));
    }
}