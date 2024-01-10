/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    GraphNode gStart;
    public int amountOfTime(TreeNode root, int start) {
        mapGraph(root, start, null);
        Queue<GraphNode> q = new LinkedList();
        q.offer(gStart);
        gStart.visited = true;
        int steps = -1;
        while (!q.isEmpty()){
            int popSize = q.size();
            for (int i = 0; i < popSize; i++){
                GraphNode cur = q.poll();
                for (GraphNode g : cur.l){
                    if (!g.visited){
                        g.visited = true;
                        q.offer(g);
                    }
                }
            }
            steps++;
        }
        return steps;
    }

    private GraphNode mapGraph(TreeNode root, int start, GraphNode parent){
        GraphNode cur = new GraphNode(parent);
        if (root.left != null) cur.l.add(mapGraph(root.left, start, cur));
        if (root.right != null) cur.l.add(mapGraph(root.right, start, cur));
        if (root.val == start) gStart = cur;
        return cur;
    }

    class GraphNode{
        List<GraphNode> l; //parent,left,right;
        boolean visited;
        public GraphNode(GraphNode parent){
            l = new ArrayList<>();
            if (parent != null) l.add(parent);
            visited = false;
        }
    }
}