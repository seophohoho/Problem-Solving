import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<List<Edge>> tree;
    private static boolean[] visited;
    private static int maxDistance;
    private static int farthestNode;

    private static class Edge {
        int target;
        int weight;

        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            String[] inputs = br.readLine().split(" ");
            int parent = Integer.parseInt(inputs[0]);
            int child = Integer.parseInt(inputs[1]);
            int weight = Integer.parseInt(inputs[2]);

            tree.get(parent).add(new Edge(child, weight));
            tree.get(child).add(new Edge(parent, weight));
        }

        visited = new boolean[n + 1];
        maxDistance = 0;
        dfs(1, 0);

        visited = new boolean[n + 1];
        maxDistance = 0;
        dfs(farthestNode, 0);

        System.out.println(maxDistance);
    }

    private static void dfs(int node, int distance) {
        visited[node] = true;

        if (distance > maxDistance) {
            maxDistance = distance;
            farthestNode = node;
        }

        for (Edge edge : tree.get(node)) {
            if (!visited[edge.target]) {
                dfs(edge.target, distance + edge.weight);
            }
        }
    }
}
