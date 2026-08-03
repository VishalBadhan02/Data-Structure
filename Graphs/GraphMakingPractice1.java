package Graphs;

import java.util.*;

public class GraphMakingPractice1 {

    public void bfs(ArrayList<ArrayList<Integer>> graph, int V, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        queue.offer(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        for(boolean b : visited){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3}
        };

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        GraphMakingPractice1 gmp = new GraphMakingPractice1();
        gmp.bfs(graph, V, 0);

        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}
