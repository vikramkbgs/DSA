public static void changeToDepthTree(BinaryTreeNode<Integer>root, int level)
	{
		if(root == null)
			return;
		 root.data = level;
		changeToDepthTree(root.left, root.data+1);
		changeToDepthTree(root.right, root.data+1);
	}