package com.gl.javafsd.ds4.brackets;

public class Bracket {

	private Character openBracket;
	private Character closeBracket;

	public Bracket(Character openBracket, Character closeBracket) {
		this.openBracket = openBracket;
		this.closeBracket = closeBracket;
	}

	public Character getOpenChar() {
		return openBracket;
	}

	public void setOpenChar(Character openBracket) {
		this.openBracket = openBracket;
	}

	public Character getCloseChar() {
		return closeBracket;
	}

	public void setCloseChar(Character closeBracket) {
		this.closeBracket = closeBracket;
	}

}
