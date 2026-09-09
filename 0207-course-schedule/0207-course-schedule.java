import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];

            graph[pre].add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;

        while (!q.isEmpty()) {
            int curr = q.remove();
            count++;

            for (int next : graph[curr]) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        return count == numCourses;
    }
}