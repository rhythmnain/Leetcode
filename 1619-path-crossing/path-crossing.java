import java.util.HashSet;

public class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");

        int x = 0, y = 0;

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String currentPos = x + "," + y;

            if (visited.contains(currentPos)) {
                return true;
            }

            visited.add(currentPos);
        }

        return false;
    }
}
