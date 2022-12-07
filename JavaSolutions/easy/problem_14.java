package JavaSolutions.easy;

public class problem_14 {
    public String longestCommonPrefix(String[] strs) {

        String shortest = "", new_short;
        if (strs.length > 0) {
            shortest = strs[0];
            for (int i = 0; i < strs.length; i++) {
                new_short = "";
                for (int j = 0; j < shortest.length(); j++) {
                    if (j < strs[i].length() && shortest.charAt(j) == strs[i].charAt(j)) {
                        new_short += shortest.charAt(j);
                    } else {
                        break;
                    }
                }
                shortest = new_short;
            }
        }
        return shortest;
    }

    // main method
    public static void main(String[] args) {
        problem_14 solution = new problem_14();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs));
        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println(solution.longestCommonPrefix(strs2));
        String[] strs3 = { "a" };
        System.out.println(solution.longestCommonPrefix(strs3));
        String[] strs4 = { "a", "b" };
        System.out.println(solution.longestCommonPrefix(strs4));
        String[] strs5 = { "a", "a" };
        System.out.println(solution.longestCommonPrefix(strs5));
        String[] strs6 = { "a", "b", "c" };
        System.out.println(solution.longestCommonPrefix(strs6));
        String[] strs7 = { "a", "a", "a" };
        System.out.println(solution.longestCommonPrefix(strs7));
    }
}
