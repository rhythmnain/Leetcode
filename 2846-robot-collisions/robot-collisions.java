class Solution {

    public List<Integer> survivedRobotsHealths(
        int[] positions,
        int[] healths,
        String directions
    ) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < n; ++index) {
            indices[index] = index;
        }

        Arrays.sort(
            indices,
            (lhs, rhs) -> Integer.compare(positions[lhs], positions[rhs])
        );

        for (int currentIndex : indices) {
            // Add right-moving robots to the stack
            if (directions.charAt(currentIndex) == 'R') {
                stack.push(currentIndex);
            } else {
                while (!stack.isEmpty() && healths[currentIndex] > 0) {
                    // Pop the top robot from the stack for collision check
                    int topIndex = stack.pop();

                    // Top robot survives, current robot is destroyed
                    if (healths[topIndex] > healths[currentIndex]) {
                        healths[topIndex] -= 1;
                        healths[currentIndex] = 0;
                        stack.push(topIndex);
                    } else if (healths[topIndex] < healths[currentIndex]) {
                        // Current robot survives, top robot is destroyed
                        healths[currentIndex] -= 1;
                        healths[topIndex] = 0;
                    } else {
                        // Both robots are destroyed
                        healths[currentIndex] = 0;
                        healths[topIndex] = 0;
                    }
                }
            }
        }

        // Collect surviving robots
        for (int index = 0; index < n; ++index) {
            if (healths[index] > 0) {
                result.add(healths[index]);
            }
        }
        return result;
    }
}
// class Solution {
//     public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
//         int n = positions.length;
//         List<int[]> robots = new ArrayList<>();

//         for (int i = 0; i < n; ++i) {
//             robots.add(new int[]{positions[i], healths[i], directions.charAt(i), i});
//         }

//         Collections.sort(robots, (a, b) -> Integer.compare(a[0], b[0]));

//         Stack<int[]> stack = new Stack<>();

//         for (int[] robot : robots) {
//             if (robot[2] == 'R' || stack.isEmpty() || stack.peek()[2] == 'L') {
//                 stack.push(robot);
//                 continue;
//             }

//             if (robot[2] == 'L') {
//                 boolean add = true;
//                 while (!stack.isEmpty() && stack.peek()[2] == 'R' && add) {
//                     int last_health = stack.peek()[1];
//                     if (robot[1] > last_health) {
//                         stack.pop();
//                         robot[1] -= 1;
//                     } else if (robot[1] < last_health) {
//                         stack.peek()[1] -= 1;
//                         add = false;
//                     } else {
//                         stack.pop();
//                         add = false;
//                     }
//                 }

//                 if (add) {
//                     stack.push(robot);
//                 }
//             }
//         }

//         List<int[]> resultList = new ArrayList<>(stack);
//         resultList.sort(Comparator.comparingInt(a -> a[3]));

//         List<Integer> result = new ArrayList<>();
//         for (int[] robot : resultList) {
//             result.add(robot[1]);
//         }

//         return result;
//     }
// }