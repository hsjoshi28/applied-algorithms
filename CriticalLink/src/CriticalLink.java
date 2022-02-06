import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalLink {

    public int criticalLink(int n, int[][] links) {

        int[] disc = new int[n], low = new int[n];
        List<Integer>[] graph = new ArrayList[n];
        List<List<Integer>> res = new ArrayList<>();
        Arrays.fill(disc, -1);
        for (
                int i = 0;
                i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (
                int i = 0; i < links.length; i++) {
            int from  = links[i][0];
            int to = links[i][1];
            graph[from].add(to);
            graph[to].add(from);
        }
        int count = 0;

        for (int i = 0;i < n; i++) {
            if (disc[i] == -1) {
                count += dfs(i, low, disc, graph, res, i, count);

            }
        }
        return count;
    }

    int time = 0;

    private int dfs(int u, int[] low, int[] disc, List<Integer>[] graph, List<List<Integer>> res, int pre, int count) {
//        int count = 0;
        disc[u] = low[u] = ++time;
        for (int j = 0; j < graph[u].size(); j++) {
            int v = graph[u].get(j);
            if (v == pre) {
                continue;
            }
            if (disc[v] == -1) {
                dfs(v, low, disc, graph, res, u, count);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) {
                    count++;
                    res.add(Arrays.asList(u, v));
                }
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

    return count;
    }
}
