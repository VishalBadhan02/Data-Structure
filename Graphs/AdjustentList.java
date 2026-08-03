package Graphs;

import java.util.ArrayList;

public class AdjustentList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int V =4;

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());  
        }
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(1);
        
        graph.get(3).add(1);
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
        
    }
}
