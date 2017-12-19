# Trees

## Types of Binary Trees
- Complete Binary Trees

  Binary tree in which every level of the tree is fully filled, except for perhaps the last level. To the extent that the last level is filled, it filled left to right.
  
- Full Binary Trees

  Binary tree in which every node has either zero or two children.
  
- Perfect Binary Trees

  All leaf nodes at the same depth.
  
## Binary Tree Traversal
- In Order Traversal

  Visit the left branch, then the current node and the right branch.

	```Java
	void inOrderTraversal(TreeNode node) {
	  if (node != null) {
	    inOrderTraversal(node.left);
	    visit(node);
	    inOrderTraversal(node.right);
	  }
	}
	```

- Pre-Order Traversal

  Visit the current node before its child nodes
  
  ```
        1
       / \
      /   \
     /     \
    2       7
   / \     / \
  3   4   8   9
     / \
    5   6
  ```
  
- Post-Order Traversal

  Visit the current node after its child nodes
  
  ```
        9
       / \
      /   \
     /     \
    5       8
   / \     / \
  1   4   6   7
     / \
    2   3
  ```
