import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int startV = Integer.parseInt(inputs[2]);

        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            String[] UV = br.readLine().split(" ");
            Integer U = Integer.parseInt(UV[0]);
            Integer V = Integer.parseInt(UV[1]);

            graph.get(U).add(V);
            graph.get(V).add(U);
        }

        for(int i=0;i<=N;i++){
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N+1];
        List<Integer> dfsResult = new ArrayList<>();
        dfs(startV, visited, dfsResult);

        for(Integer value: dfsResult){
            System.out.print(value+" ");
        }

        System.out.print("\n");

        visited = new boolean[N+1];
        List<Integer> bfsResult = new ArrayList<>();
        bfs(startV,visited,bfsResult);

        for(Integer value: bfsResult){
            System.out.print(value+" ");
        }
    }

    private static void dfs(int node, boolean[] visited, List<Integer> result){
        visited[node] = true;
        result.add(node);

        for(int neighbor: graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,visited,result);
            }
        }
    }

    private static void bfs(int startV, boolean[] visited, List<Integer> result){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startV);
        visited[startV] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);

            for(int neighbor: graph.get(node)){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
