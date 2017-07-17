package com.Trees;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializeAndDeserializeBST {

	public static void main(String[] args) {
		TreeNode root = createBST(new int[] { 3, 4, 7, 2, 9, 5, 6, 8, 1, 0 });
		ArrayList<Integer> s = new ArrayList<>();
		SerializeAndDeserializeBinaryTree.serialize(root, s);
		s.stream().forEach(x -> System.out.print(x + " "));
		System.out.println("\n************");
		s.clear();
		serializeBST(root, s);
		s.stream().forEach(x -> System.out.print(x + " "));
		System.out.println("\n************");
		TreeNode deserializedRoot = deserializeBST(Integer.MIN_VALUE, Integer.MAX_VALUE, s);
		System.out.println("\n************");
		s.clear();
		serializeBST(deserializedRoot, s);
		s.stream().forEach(x -> System.out.print(x + " "));

	}

	private static void serializeBST(TreeNode root, ArrayList<Integer> s) {
		if (root != null) {
			s.add(root.val);
			serializeBST(root.left, s);
			serializeBST(root.right, s);
		}
	}

	static int index = 0;

	private static TreeNode deserializeBST(int min, int max, ArrayList<Integer> s) {
		if (index >= s.size()) {
			return null;
		}
		TreeNode root = null;
		if (s.get(index) > min && s.get(index) < max) {
			root = new TreeNode(null, null, s.get(index));
			index++;
			root.left=deserializeBST(min, root.val, s);
			root.right=deserializeBST(root.val, max, s);
		}
		return root;
	}

	private static TreeNode createBST(int[] inputArray) {
		TreeNode root = null;
		for (int x : inputArray)
			root = bst(root, x);
		return root;
	}

	public static void serializeBST(TreeNode root) {

	}

	private static TreeNode bst(TreeNode root, int input) {
		if (root == null) {
			root = new TreeNode(null, null, input);
		} else if (input > root.val) {
			if (root.right != null)
				bst(root.right, input);
			else
				root.right = new TreeNode(null, null, input);
		} else {
			if (root.left != null)
				bst(root.left, input);
			else
				root.left = new TreeNode(null, null, input);
		}
		return root;
	}

}
