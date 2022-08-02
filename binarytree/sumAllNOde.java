 public static int getSumHelper(BinaryTreeNode<Integer> root, int sum)
    {
        if(root == null)
            return 0;
        
        sum += root.data;
        System.out.println(sum);
        getSumHelper(root.left, sum);
        getSumHelper(root.right, sum);
        
        return sum;
        
    }