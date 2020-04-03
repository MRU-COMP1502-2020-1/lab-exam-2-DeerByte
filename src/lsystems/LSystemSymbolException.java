package lsystems;

public class LSystemSymbolException extends Exception {
	private char symbol;
	
	public LSystemSymbolException(String message) {
		super(message);
	}
	
	public LSystemSymbolException(String message, char symbol) {
		super(message);
		this.symbol = symbol;
	}
	
	public LSystemSymbolException(Throwable cause) {
		super(cause);
	}
	
	public LSystemSymbolException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public char getSymbol() {
		return symbol;
	}
}
