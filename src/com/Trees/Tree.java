package com.Trees;
class TreeNode{
		TreeNode left;
		TreeNode right;
		int val ;
		public TreeNode(TreeNode left, TreeNode right, int val) {
			super();
			this.left = left;
			this.right = right;
			this.val = val;
		}
}
public class Tree {
	 public  TreeNode createTree(){
		 /*
		  *     	          1
		  *    		   	/     	  \
		  *   	   	  2  	 	    3
		  *   	   / 	 \     	  /   \
		  *   	  4   	   5     6     7
		  *   	 / \ 	  / \   / \   / \
		  *  	#   8    9   # #   # #   #
		  *  	   / \  / \	
		  *  	  #  # #   #
		  */
		 TreeNode n9 = new TreeNode(null, null, 9);
		 TreeNode n8 = new TreeNode(null, null, 8);
		 TreeNode n7 = new TreeNode(null, null, 7);
		 TreeNode n6 = new TreeNode(null, null, 6);
		 TreeNode n5 = new TreeNode(n9, null, 5);
		 TreeNode n4 = new TreeNode(null, n8, 4);
		 TreeNode n3 = new TreeNode(n6, n7, 3);
		 TreeNode n2 = new TreeNode(n4, n5, 2);
		 TreeNode n1 = new TreeNode(n2, n3, 1);
		 return n1;
	 }
	 
	// traversals
	// DFS & BFS
	
}
