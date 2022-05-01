package com.gl.javafsd.ds4.brackets;

public class Bracketstest {
	public static void main (String[] args) { 
		test("{[]}");
	test("[{}");
}

	private static void test(String brackets) {
		
		BalancedBracketChecker Checker  = new BalancedBracketChecker(brackets);
		boolean result = Checker.check();
		
		if (result) {
			System.out.println("Bracket Expression" + brackets + "is balanced");}
			else{
				System.out.println("Bracket Expression" + brackets + "is not balanced");
			} 
					
			
		}
		
		
	}
