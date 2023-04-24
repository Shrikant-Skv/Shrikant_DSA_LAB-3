package com.greatlearning.q1balancingbrackets;

import java.util.Stack;

public class BalancingBrackets {
	public static void main(String args[]) {

		String bracketExpression = "([[{}]])";
		if (isBracketsBalanced(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
	}

	/*
	 * For Each character in the given expression if Open bracket --> push it to
	 * stack. else if Close bracket --> pop it & then validate its corresponding
	 * open bracket. return stack.isEmpty()
	 */

	private static boolean isBracketsBalanced(String bracketExpression) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		char[] chars = bracketExpression.toCharArray();
		for (char ch : chars) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);

			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				switch (ch) {
				case ')': {
					if (stack.pop() != '(') {
						return false;
					}
					break;
				}
				case ']': {
					if (stack.pop() != '[') {
						return false;
					}
					break;
				}
				case '}': {
					if (stack.pop() != '{') {
						return false;
					}
					break;
				}
				default: {
					System.out.println("Invalid character in the bracket expression.");
					return false;
				}
				}
			}
		}
		return stack.isEmpty();
	}
}