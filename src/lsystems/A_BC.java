package lsystems;

/**
 * Subclass of LRule. This rule requires a char value of 'A' and replaces
 *  it with a char array ['BC'].
 *  
 * @author DeerByte
 *
 */
public class A_BC extends LRule {

	public static final char MATCH = 'A';
	public static final char[] BODY = {'B', 'C'};
	
	/**
	 * Returns a char representation match character.
	 * @return char - The match character the rule to applies to.
	 */
	@Override
	public char getMatch() {
		
		return MATCH;
	}

	/**
	 * Returns the array of characters this rule creates.
	 * @return char[] - The character(s) that will replace the match character.
	 */
	@Override
	public char[] getBody() {
		return BODY;
	}

}
