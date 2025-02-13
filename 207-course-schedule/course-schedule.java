class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        Map<Integer, List<Integer>> courseList = new HashMap<>();
        for (int i = 0; i < inDegree.length; i++){
            inDegree[i] = 0;
        }
        for (int i = 0; i < prerequisites.length; i++){
            inDegree[prerequisites[i][0]] ++;
            int key =  prerequisites[i][1];
            courseList.computeIfAbsent(key, k -> new ArrayList<>()).add(prerequisites[i][0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++){
            if (inDegree[i] == 0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int val = queue.poll();
            List<Integer> courses = courseList.get(val);
            if (courses != null){
                for (int i = 0 ; i < courses.size(); i++){
                    inDegree[courses.get(i)] -= 1;
                    if (inDegree[courses.get(i)] == 0){
                        queue.add(courses.get(i));
                    }
                }
            }
        }
        for (int i = 0; i < inDegree.length; i++){
            if (inDegree[i] != 0) return false;
        }
        return true;
    }
}