package rpgrandom.scriptingengine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
	private ArrayList<Token> tokens;
	
	public Parser() {
		tokens = new ArrayList<Token>();
	}
	
	public AST parse(Scanner s) {
		while(s.hasNextLine()) {
			addTokensFromLine(tokens, s.nextLine());
		}
		
		
		return null;
	}
	
	private void addTokensFromLine(ArrayList<Token> currentTokens, String line) {
		return;
	}
}