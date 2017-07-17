package com.Trees;
import java.util.ArrayList;

public class SerializeAndDeserializeBinaryTree {
	 public static void main(String[] args) {
		 TreeNode root = new Tree().createTree();
		 //Serialize
		 ArrayList<Integer> s= new ArrayList<Integer>();
		 serialize(root,s);
		 s.stream().forEach(x -> System.out.print(x + " "));
		 System.out.println("\n************ ");
		 s.clear();
		 System.out.println("After deserialize ");
		 System.out.println("************ ");
		 TreeNode deserializedRoot = deserialize(s);
		 System.out.println("After deserialize ");
		 serialize(root,s);
		 s.stream().forEach(x -> System.out.print(x + " "));
	 }
	static int index=0;
	public static TreeNode deserialize(ArrayList<Integer> s) {
		if(s.isEmpty() || s.get(index)==-1){
			index++;
			return null;			
		}
		TreeNode root = new TreeNode(null,null,s.get(index));
		index++;
		root.left = deserialize(s);
		root.right= deserialize(s);
		return root;
	}

	public static void serialize(TreeNode root, ArrayList<Integer> s) {
		if(root==null){
			s.add(-1);
			return;
		}
		s.add(root.val);
		serialize(root.left,s);
		serialize(root.right,s);
	}
}
