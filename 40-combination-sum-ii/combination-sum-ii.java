import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort candidates to simplify the backtracking process
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) { // Base case: target is achieved
            result.add(new ArrayList<>(current)); // Add the current combination to the result
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break; // Stop exploring this branch if the candidate is larger than the target
            }

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates to avoid duplicate combinations
            }

            current.add(candidates[i]); // Choose the current candidate
            backtrack(candidates, target - candidates[i], i + 1, current, result); // Explore further combinations
            current.remove(current.size() - 1); // Backtrack: remove the last chosen candidate
        }
    }
}
