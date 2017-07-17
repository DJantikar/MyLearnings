package com.Trees;

import java.util.LinkedList;
import java.util.Queue;



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
	 public  static TreeNode createTree(){
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
	 public static TreeNode createBST(){
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
		 int[] nums = {4,2,5,10,1,0,11,9};
		 TreeNode root= bst(nums);
		 return root;
	 }
	private static TreeNode bst(int[] nums) {
		TreeNode root = null;
		 for(int n : nums){
			 root=bstInsert(root,n);
		 }
		 return root;
	}
	 private static TreeNode bstInsert(TreeNode root, int n) {
		if(root==null){
			root=new TreeNode(null,null,n);
		}
		else if(root.val >= n){
			if(root.left == null)
				root.left=new TreeNode(null,null,n);
			else
				bstInsert(root.left,n);
		}
		else{
			if(root.right == null)
				root.right=new TreeNode(null,null,n);		
			else
				bstInsert(root.right,n);
		}
		return root;
	}
	public static void printTree(TreeNode root){
			
			bfs(root);
		}
		public static void bfs(TreeNode root){
			if(root==null)
				return; 
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()){
				TreeNode n = q.poll();
				System.out.print(n.val+" ");
				if(n.left!=null)
					q.add(n.left);
				if(n.right!=null)
					q.add(n.right);
			}
			System.out.println();
		}
		public void dfs(TreeNode root){
			preorder(root);
			System.out.println();
			postorder(root);
			System.out.println();
			inorder(root);
		}
		public static void inorder(TreeNode root) {
			if(root!=null){
				inorder(root.left);
				System.out.print(root.val+ " ");
				inorder(root.right);
			}	
		}
		public void postorder(TreeNode root) {
			if(root!=null){
				postorder(root.left);
				postorder(root.right);
				System.out.print(root.val);
			}
			
		}
		public void preorder(TreeNode root) {
			if(root!=null){
				System.out.print(root.val);
				preorder(root.left);
				preorder(root.right);
			}
		}
		public static void main(String[] args) {
		
			TreeNode root=Tree.createTree();
			Tree.printTree(root);
		}

	// traversals
	// DFS & BFS
	
}
