package com.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		TreeNode root = Tree.createTree();
		List<Integer> l = levelOrderTraversal(root);		
		if( null != l)
			l.stream().forEach(x->System.out.print(x+" "));
	}

	public static List<Integer> levelOrderTraversal(TreeNode root) {
		if(root==null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<Integer> l = new ArrayList<>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();
			if(null != tmp.left)
				q.add(tmp.left);
			if(null != tmp.right)
				q.add(tmp.right);
			l.add(tmp.val);
		}
		return l;
	}
}
