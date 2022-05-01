package com.gl.javafsd.ds4.brackets;

import java.util.Set;
import java.util.Stack;

public class BalancedBracketChecker {

	private String brackets;
	
	public BalancedBracketChecker(String brackets) {
		this.brackets = brackets;
	}
	
	public boolean check() {
		
		if (brackets.length() % 2 != 0) {
			return false; 
		}
		Stack<Character> stack = new Stack<Character>() ;
		
		Set<Character>  openBracketSet = BracketsManager.getOpenBrackets();
		Set<Character>  closeBracketSet = BracketsManager.getCloseBrackets();
		
		for (int index = 0; index < brackets.length(); index ++) {
			char achar = brackets.charAt(index);
			if(openBracketSet.contains(achar)) {
				stack.push(achar);
							}
			else if(closeBracketSet.contains(achar)) {
				char closedChar = achar;
			
			
			Character openCharFromStack = stack.pop();
			Bracket bracketObj 
			= BracketsManager.getBracket(closedChar);
			
			if (openCharFromStack.equals(
					bracketObj.getOpenChar())){
				continue;
			}
				else {
			System.out.println("Invalid Character encountered during Traversal" + achar);
				}
			return false;	}}
	return stack.isEmpty();		
	}
	
}
