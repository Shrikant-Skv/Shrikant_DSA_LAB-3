package com.greatlearning.q2bstsumpair;

import java.util.HashSet;
import java.util.Set;

public class SumPair {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(40);
		root.insertData(20, root);
		root.insertData(60, root);
		root.insertData(10, root);
		root.insertData(30, root);
		root.insertData(50, root);
		root.insertData(70, root);

		int targetSum = 130;

		Set<Integer> data = new HashSet<Integer>();
		if (!findSumPair(root, targetSum, data)) {
			System.out.println("Pair not found for given Sum.");
		}
	}

	/*
	 * In Order Traversal 
	 * if(remainder is already present in the set), then we print the pair 
	 * (i.e.) if processing 10 for a sum = 130, then check whether remainder(120) is present 
	 * else Add the element in the set.
	 */
	private static boolean findSumPair(TreeNode root, int targetSum, Set<Integer> data) {
		// base condition to come out of recursive
		if (root == null) {
			return false;
		}
		
		// process the left
		if (findSumPair(root.left, targetSum, data)) {
			return true;
		}
		// process the root
		int remainder = targetSum - root.data;
		if (data.contains(remainder)) {
			System.out.println("The Pair(" + root.data + "," + remainder + ") can form the given Sum");
			return true;
		} else {
			data.add(root.data);
		}
		// process the right
		return findSumPair(root.right, targetSum, data);
	}
}
