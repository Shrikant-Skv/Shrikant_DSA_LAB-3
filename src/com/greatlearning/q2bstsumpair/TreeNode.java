package com.greatlearning.q2bstsumpair;

public class TreeNode {

	int data;
	TreeNode left, right;

	// Constructor
	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}

	// Method to add data in Binary Search Tree Format
	public TreeNode insertData(int data, TreeNode root) {
		if (root == null) {
			return new TreeNode(data);
		}
		if (data < root.data) {
			root.left = insertData(data, root.left);
		} else if (data > root.data) {
			root.right = insertData(data, root.right);
		} else {
			System.out.println("Given data is already present in Binary Search Tree.");
		}
		return root;
	}

}
