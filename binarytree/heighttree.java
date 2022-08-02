public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if (root == null)
            return 0;
        else
        {
            int lDepth =height(root.left);
            int rDepth = height(root.right);
  
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }