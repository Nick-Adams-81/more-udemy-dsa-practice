package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> list = new HashMap<>();

    public void printGraph() {
        System.out.println(list);
    }
    public boolean addVertex(String vertex) {
        if(list.get(vertex) == null) {
            list.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if(list.get(vertex1) != null && list.get(vertex2) != null) {
            list.get(vertex1).add(vertex2);
            list.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(list.get(vertex1) != null && list.get(vertex2) != null) {
            list.get(vertex1).remove(vertex2);
            list.get(vertex2).remove(vertex2);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if(list.get(vertex) == null) return false;
        for(String otherVertex : list.get(vertex)) {
            list.get(otherVertex).remove(vertex);
        }
        list.remove(vertex);
        return true;
    }

}
