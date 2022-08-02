public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if (root == null)
        return false;
 
    if (root.data == x)
        return true;
 
    boolean flag1 = isNodePresent(root.left, x);
   
    if(flag1) return true;
 
    
    boolean flag2 = isNodePresent(root.right, x);
 
    return flag2;
	}