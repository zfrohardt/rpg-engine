package rpgrandom.scriptingengine;

public class ASTNode {
	private Token token;
	private ASTNode left;
	private ASTNode right;
	
	public ASTNode() {
		this(null, null, null);
	}
	
	public ASTNode(Token token) {
		this(token, null, null);
	}
	
	public ASTNode(Token token, ASTNode left, ASTNode right) {
		this.token = token;
		this.left = left;
		this.right = right;
	}
	
	public Token getToken() {
		return this.token;
	}
	
	public void setToken(Token token) {
		this.token = token;
	}
	
	public ASTNode getLeft() {
		return this.left;
	}
	
	public void setLeft(ASTNode left) {
		this.left = left;
	}
	
	public ASTNode getRight() {
		return this.right;
	}
	
	public void setRight(ASTNode right) {
		this.right = right;
	}
}
