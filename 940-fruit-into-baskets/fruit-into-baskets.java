class Solution {
    public int totalFruit(int[] fruits) {
         Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);

            // Shrink the window until we have at most 2 types of fruits
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;
            }

            // Update maxFruits with the size of the current valid window
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}