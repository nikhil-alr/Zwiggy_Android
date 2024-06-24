import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visitedNode = new boolean[adj.size()];
        queue.add(0);
        ArrayList<Integer> output = new ArrayList<>();

        while(!queue.isEmpty())
        {
            int node = queue.poll();

            ArrayList<Integer> nbrNodes = adj.get(node);

            for(int nbrNode:nbrNodes)
            {
                if(!visitedNode[nbrNode])
                {
                    queue.add(nbrNode);
                }
            }

            output.add(node);
            visitedNode[node] = true;
        }
        return output;

    }
}