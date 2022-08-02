public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
        if(root == null)
			return 0;
		int count = 0;
		int smallSum = root.data;
		count += countNodesGreaterThanX(root.left, x);
		count += countNodesGreaterThanX(root.right, x);
        if(smallSum > x)
		count++;
		return count;
	}