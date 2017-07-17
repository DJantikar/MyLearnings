package com.Trees;




public class BSTBalancedFromSortedArray {

	public static void main(String[] args) {

		int a[] = {2,4,5,7,8,10,15};
		TreeNode root = createBalancesBST(a,0,a.length-1);
		
		Tree.printTree(root);
	}

	private static TreeNode createBalancesBST(int[] a, int start, int end) {
		if(start>end)
			return null;
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(null,null,a[mid]);
		root.left = createBalancesBST(a,start,mid-1);
		root.right = createBalancesBST(a,mid+1,end);
		return root;
	}

}
