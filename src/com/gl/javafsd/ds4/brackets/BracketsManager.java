package com.gl.javafsd.ds4.brackets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {
	
	//decalring the set
	public static Set<Bracket> predefinedBrackets; 
	
	static {
		//initialising the set
		predefinedBrackets = new LinkedHashSet<Bracket>();
		predefinedBrackets.add(new Bracket('(',')'));
		predefinedBrackets.add(new Bracket('[',']'));
		predefinedBrackets.add(new Bracket('{','}'));
		predefinedBrackets.add(new Bracket('<','>'));
	}
	
	public static Set<Character> getOpenBrackets(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> itr = predefinedBrackets.iterator();
		while (itr.hasNext()) {
			Bracket bracket = itr.next();
			result.add(bracket.getOpenChar()); 
		}
		return result;
	}
	
	public static Set<Character> getCloseBrackets(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> itr = predefinedBrackets.iterator();
		while (itr.hasNext()) {
			Bracket bracket = itr.next();
			result.add(bracket.getCloseChar()); 
		}
		return result;
	}
	
	public static Bracket getBracket(Character closeBracket) {
		for (Bracket predefinedBracket : predefinedBrackets) {
			if (predefinedBracket.getCloseChar().equals(closeBracket)) {
				return predefinedBracket;
			}
		}
		return null; 
	}

}
