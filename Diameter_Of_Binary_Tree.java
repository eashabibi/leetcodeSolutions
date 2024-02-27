// optimal Approach
----------------------------
class Solution {
    int result = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return result;
    }

    public int depth(TreeNode node){
        if(node == null) return 0;
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        int currrentD = leftDepth + rightDepth;
        result = Math.max(result, currrentD);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}

//general method:
----------------------------

public class DiameterOfABinaryTree {

  public int diameterOfBinaryTree(TreeNode root) {

    Map<TreeNode, Integer> map = new HashMap<>();
    Stack<TreeNode> stack = new Stack<>();
    int diameter = 0;

    if (root != null)
      stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode node = stack.peek();

      // Fill up stack to perform post-order traversal
      if (node.left != null && !map.containsKey(node.left)) {
        stack.push(node.left);
      } else if (node.right != null && !map.containsKey(node.right)) {
        stack.push(node.right);
      } else {

        // Process the root, once left and right sub-tree have been processed
        stack.pop();
        int leftDepth = map.getOrDefault(node.left, 0);
        int rightDepth = map.getOrDefault(node.right, 0);

        // Put the max depth at a node in the map
        map.put(node, 1 + Math.max(leftDepth, rightDepth));

        // Update the max diameter found so far
        diameter = Math.max(diameter, leftDepth + rightDepth);
      }
    }
    return diameter;
  }

}
