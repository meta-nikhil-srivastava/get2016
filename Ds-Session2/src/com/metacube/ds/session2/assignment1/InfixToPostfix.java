/**
 * FileName : InfixToPostfix.java
 */
package com.metacube.ds.session2.assignment1;

import java.util.Scanner;

/**
 * This class is used for the conversion of infix to postfix expression
 * 
 * @author Nikhil
 *
 */
public class InfixToPostfix {

	private String inFix; // To store infix expression
	private String postFix; // To store the postfix expression
	private Stack<Character> conversionStack = new Stack<Character>(); // Store the elements in the Stack
	/**
	 * Non-parameterized constructor for initialization
	 */
	public InfixToPostfix() {
		inFix = "";
		postFix = "";
	}


	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Infix expression");
		inFix = input.nextLine();
		input.close();
	}

	/**
	 * This method converts the given infix expression to post fix expression
	 * 
	 * @return String postFix expression
	 */
	public String convert() {

		char value;
		int peekValue;
		int previousValue;
		conversionStack.push('(');
		// traversing through each variable in the infix notation
		for (int i = 0; i < inFix.length(); i++) {
			value = inFix.charAt(i);
			switch (value) {
			case '(':
			case '^':
				// They have highest precedence in operators
				conversionStack.push(value);
				break;
			case '*':
			case '/':
			case '+':
			case '-':
				// Check for the precedence of the stack elements and the
				// character
				previousValue = precedence(value);
				if (!(conversionStack.isEmpty())) {
					peekValue = precedence(conversionStack.peek());
					// removing element from stack according to the precedence
					while ((previousValue <= peekValue)
							&& (!(conversionStack.isEmpty()))) {
						postFix = postFix + conversionStack.pop();
						peekValue = precedence(conversionStack.peek());
					}
				}
				conversionStack.push(value);
				break;
			case ')':
				// removing the element from top for the closing bracket
				value = conversionStack.pop();
				do {
					postFix = postFix + value;
					value = conversionStack.pop();
					// continue the loop till opening bracket is found
				} while (value != '(');
				break;
			default:
				// Adding operands to the postfix string
				postFix = postFix + value;
			}
		}
		// Adding all the remaining operators to the postfix result
		value = conversionStack.pop();
		while (value != '(') {
			postFix = postFix + value;
			value = conversionStack.pop();
		}
		return postFix;
	}

	/**
	 * Method to get the precedence value of the operators
	 * 
	 * @param c
	 *            - The operator for which the precedence is to get
	 * @return The precedence value for the operator
	 */
	private int precedence(char c) {
		switch (c) {
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
		}//end of switch 
	}

	public static void main(String[] args) {
		InfixToPostfix infixPostfix = new InfixToPostfix();
		infixPostfix.getInput();
		System.out.println("PostFix expression");
		String result = infixPostfix.convert();
		System.out.println(result);
	}//end of main()

}
