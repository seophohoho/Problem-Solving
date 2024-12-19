import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean result = false;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for(int i=0;i<N;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            String[] fromAndTo = br.readLine().split(" ");
            int from = Integer.parseInt(fromAndTo[0]);
            int to = Integer.parseInt(fromAndTo[1]);
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        for(int i=0;i<N;i++){
            visited = new boolean[N];
            dfs(i,0);
        }

        System.out.println(result ? 1 : 0);
    }

    private static void dfs(int node, int depth){
        if(depth == 4){
            result = true;
            return;
        }

        visited[node] = true;

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor, depth+1);
                if(result) return;
            }
        }

        visited[node] = false;
    }
}
