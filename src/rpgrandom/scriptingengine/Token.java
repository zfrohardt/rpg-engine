package rpgrandom.scriptingengine;

public class Token {
	private TokenType type;
	private int value;
	private int lineNumber;
	
	public Token(TokenType type, int value) {
		this(type, value, -1);
	}
	
	public Token(TokenType type, int value, int lineNumber) {
		this.type = type;
		this.value = value;
		this.lineNumber = lineNumber;
	}
	
	public TokenType getType() {
		return this.type;
	}
	
	public int getValue() {
		return this.value;
	}
}