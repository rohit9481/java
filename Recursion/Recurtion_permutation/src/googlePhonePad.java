import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits (2-9): ");
        String digits = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        List<String> combinations = solution.letterCombinations(digits);

        System.out.println("Possible Letter Combinations: " + combinations);
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return generateCombinations("", digits);
    }

    private List<String> generateCombinations(String result, String original) {
        if (original.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        int digit = original.charAt(0) - '0';  // Convert character to integer
        String[] mapping = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        String letters = mapping[digit];
        List<String> list = new ArrayList<>();

        for (char ch : letters.toCharArray()) {
            list.addAll(generateCombinations(result + ch, original.substring(1)));
        }

        return list;
    }
}
