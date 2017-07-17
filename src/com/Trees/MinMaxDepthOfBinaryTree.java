package com.Trees;



public class MinMaxDepthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root  = Tree.createTree();
		Tree.printTree(root);
		int minDepth = minDepth(root)-1;
		
		int maxDepth = maxDepth(root)-1;
		System.out.println("min depth : "+minDepth);
		System.out.println("max depth : "+maxDepth);
	}

	private static int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		int left = root.left!=null ? maxDepth(root.left) : Integer.MIN_VALUE;
		int right = root.right!=null ? maxDepth(root.right) : Integer.MIN_VALUE;
		return 1+Math.max(left, right);
	}

	private static int minDepth(TreeNode root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		int left = root.left!=null ? minDepth(root.left) : Integer.MAX_VALUE;
		int right = root.right!=null ? minDepth(root.right) : Integer.MAX_VALUE;
		return 1+Math.min(left, right);
		//return 0;
	}

}
