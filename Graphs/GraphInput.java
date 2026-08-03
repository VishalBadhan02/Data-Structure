package Graphs;

import java.util.ArrayList;

public class GraphInput {

    public static void main(String[] args) {
        int V = 5;

        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 2},
            {1, 3},
            {2, 4},
            {3, 4}
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

        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}
