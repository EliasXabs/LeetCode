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
}
