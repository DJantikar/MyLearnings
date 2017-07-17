package com.Trees;


public class LCA {

	public static void main(String[] args) {
		
		TreeNode root =  Tree.createTree();
		System.out.println(lca(root,2,4));
	}

	private static int lca(TreeNode root, int val1, int val2) {
		if(root==null)
			return -1;
		if(root.val== val1 || root.val == val2){
			return root.val;
		}
		int isLeft=lca(root.left,val1,val2);
		int isRight=lca(root.right,val1,val2);
		if(isLeft!=-1 && isRight !=-1){
			return root.val;
		}
		else if(isLeft ==-1 && isRight ==-1){
			return -1;
		}
		else{
			return isLeft==-1 ? isRight : isLeft;
		}
	}
	
/*
 *     5
 *    / \
 *   6   4
 *      / \
 *     1   2
 */
}
