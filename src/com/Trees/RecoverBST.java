package com.Trees;

public class RecoverBST {

	public static void main(String[] args) {
		TreeNode root = Tree.createBST();
		Tree.inorder(root);
		 int tmp = root.left.val;
		 root.left.val=root.right.val;
		 root.right.val=tmp;
		 System.out.println();
		 Tree.inorder(root);
		 System.out.println();
		 inorderModified(root);
		System.out.println(first.val);
		System.out.println(second.val);
		
	}
	static TreeNode prev , first,  second;
	public static void inorderModified(TreeNode root) {
		if(root!=null){		
			inorderModified(root.left);
			if(prev !=null && prev.val>root.val){
				if(first==null)
					first=prev;
				second=root;		
			}
			prev=root;
			inorderModified(root.right );
		}	
	}
}
